// Sespendendo, retomando e encerrando um thread

class MyThread implements Runnable {
    Thread thrd;

     boolean suspended;
     boolean stopped;

     MyThread(String name) {
         thrd = new Thread(this, name);
         suspended = false;
         stopped = false;
         thrd.start();
     }

     // Este é o ponto de entrada da Thread
    public void run() {
        System.out.println(thrd.getName() + " starting!");
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Usa um bloco sincronizado para verificar suspend e stopped
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted!");
        }
        System.out.println(thrd.getName() + " exiting!");
    }

    // encerra a thread
    synchronized void mystop() {
        stopped = true;

        // O código a deguir cuida para que uma thread suspensa possa ser encerrada.
        suspended = false;
        notify();
    }

    // suspende a thread
    synchronized void mysuspend() {
        suspended = true;
    }

    // Retoma a thread
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

class Suspend {
    public static void main(String[] args) {
        MyThread ob1 = new MyThread("My Thread");


        try {
            Thread.sleep(1000); // Permite que a Thread ob1 começe a ser executada

            ob1.mysuspend();
            System.out.println("Suspending Thread...");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming Thread...");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Suspending Thread...");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming Thread...");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Stopping Thread...");
            ob1.mystop();
        } catch ( InterruptedException exc) {
            System.out.println("Main Thread interrupted!");
        }

        // esperra a thread terminar
        try {
            ob1.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main Thread Interrupted.");
        }

        System.out.println("MainThread exiting.");
    }
}