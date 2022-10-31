// Cria uma Thread implementando Runnable.

class MyThread implements Runnable {
    Thread thrd;

    // Constrói uma nova Thread
    MyThread(String name) {
        thrd = new Thread(this, name); // Thread é nomeada quando craida
        thrd.start(); // Começa a executar a Thread
    }

    // Ponto de entrada da thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " , count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interupted.");
        }
        System.out.println(thrd.getName() + " is terminating.");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");


        // Primeiro constrói um objeto MyThread
        MyThread mt = new MyThread("Child #1"); // agora a thread começa quando é criada

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main Thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}