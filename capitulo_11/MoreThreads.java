// Cria várias Threads

class MyThread implements Runnable {
    Thread thrd;

    // Constrói uma nova Thread
    MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    // Começa a execução da nova Thread.
    public void run() {
        System.out.println(thrd.getName() + " strating.");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + i);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main Thread starting...");

        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");

        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.thrd.isAlive() ||
                 mt2.thrd.isAlive() ||
                 mt3.thrd.isAlive());
        System.out.println("Main thread ending.");
    }
}