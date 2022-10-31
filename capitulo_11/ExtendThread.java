// Cria uma Thread implementando Runnable.

class MyThread extends Thread {
    // Constrói uma nova Thread
    MyThread(String name) {
        super(name); // Thread é nomeada quando craida
        start(); // Começa a executar a Thread
    }

    // Ponto de entrada da thread
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + " , count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interupted.");
        }
        System.out.println(getName() + " is terminating.");
    }
}

class ExtendThread {
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