// Controlando a thread principal

class  UseMain {
    public static void main(String[] args) {
        Thread thrd;

        // Acessa a thread principal
        thrd = Thread.currentThread();

        // Exibe o nome da Trhead principal
        System.out.println("Main thread is called: " + thrd.getName());

        // Exiber a prioridade da Thread principal.
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        // Define nome e prioridade.
        System.out.println("Setting name and priority.\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        // Exibe o nome da Trhead principal
        System.out.println("Main thread is now called: " + thrd.getName());

        // Exiber a prioridade da Thread principal.
        System.out.println("New priority: " + thrd.getPriority());

    }
}