// Demonstra as Exceções de fila
package queue;

class QEcxDemo {
    public static void main(String[] args) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try {
            // excede o tamanho da fila
            for (i = 0; i < 11; i++) {
                System.out.print("Attempting to Store: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println("  - OK!");
            }
            System.out.println();
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            // Tenta acessar elemento em fila vazia
            for (i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}