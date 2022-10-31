// Usa wait() e notify() para simular um relógio funcionando.

class TickTock {
    String state; // contém o estado do relógio

    synchronized void tick(boolean running) {
        if(!running) { // interrompe o relógio
            state = "ticked";
            notify(); // notifica qualquer thread que estiver esperando
            return;
        }
        System.out.print("Tick ");


        state = "ticked"; // define o estado atual como ticked

        notify(); // permite que tock seja executado
        try {
            Thread.sleep(500);
            while (!state.equals("tocked"))
                wait(); // espera tok terminar
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted!");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) { // interrompe o relógio
            state = "tocked";
            notify(); // notifica qualquer thread que estiver esperando
            return;
        }

        System.out.println("Tock");

        state = "tocked"; // define o estado atual como tocked

        notify(); // permite que tick seja executado
        try {
            Thread.sleep(500);
            while (!state.equals("ticked"))
                wait(); // espera tok terminar
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted!");
        }
    }
}

class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // constrói uma nova thread
    MyThread (String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // inicia a thread
    }

    // começa a execução da nova thread
    public void run() {

        if(thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 20; i++) ttOb.tick(true);
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 20; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread mt1 = new MyThread("Tick", tt);
        MyThread mt2 = new MyThread("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}