// Demonstra uma classe genérica de fila

class GenQDemo {
    public static void main(String[] args) {
        // cria uma fila de inteiros
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstra queue de Integers:");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i); // Adiciona o valor inteiro a q
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            for (int i = 0;
                 i < 5;
                 i++) {
                System.out.print("Getting next integer from q:");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();


        // cria uma fila de double
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Demonstra queue de Double:");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + (double) i / 2 + " to q.");
                q2.put((double) i/2); // Adiciona o valor inteiro a q
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0;
                 i < 5;
                 i++) {
                System.out.print("Getting next integer from q:");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();
    }
}
