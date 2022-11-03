// Enumeração com as cores de um semáforo
enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    TrafficLightColor(int delay) { this.delay = delay; }

    int getDelay() { return delay; }
}

// Semáforo computadorizado
class TrafficLightSimulator implements Runnable {
    private Thread thrd; // comtém a thread que executa a simulação
    private TrafficLightColor tlc; // contém a cor do sinal
    boolean stop = false; // configura como true para interromper a simulação
    boolean change = false; // true quando o sinal mudou

    TrafficLightSimulator(TrafficLightColor init){
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    // Inicia o semáforo
    public void run() {
        while(!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        Thread.sleep(tlc.getDelay());
                        break;
                    case YELLOW:
                        Thread.sleep(tlc.getDelay());
                        break;
                    case RED:
                        Thread.sleep(tlc.getDelay());
                        break;
                }
            } catch ( InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Muda a cor
    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }

        change = true;
        notify(); // sinaliza que a cor mudou
    }

    // espera até a mudança de sinal ocorrer
    synchronized void waitForChange() {
        try {
            while (!change)
                wait();
            change = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // retorna a cor atual
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    // Interrope o semáforo
    synchronized void cancel() {
        stop = true;
    }
}

class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);

        for(int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
    }
}