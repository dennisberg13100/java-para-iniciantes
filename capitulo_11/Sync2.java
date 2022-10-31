// Usa um bloco sincronizado para controlar o acesso a sumArray

class SumArray {
    private int sum;

    int sumArray(int nums[] ) {
        sum = 0; // redefine sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(100); // permite a alternância de tarefas
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // constrói uma nova thread
    MyThread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }

    // começa a execução da nova thread
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting...");

        // sincroniza as chamadas a sumArray()
        synchronized(sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}

class Sync2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        MyThread mt1 = new MyThread("Child #1", a);
        MyThread mt2 = new MyThread("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}