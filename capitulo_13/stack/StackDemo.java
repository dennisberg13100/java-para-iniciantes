// Demonstra uma classe genérica de pilha

class StackDemo {
    public static void main(String[] args) {
        // cria uma pilha de inteiros
        Integer iStore[] = new Integer[10];
        Stack<Integer> stack = new Stack<>(iStore);

        Integer iVal;

        System.out.println("Demonstra uma stack de Integers:");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " to the stack.");
                stack.push(i); // adiciona um valor inteiro a stack
            }
        } catch (StackFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting the next integer form the stack: ");
                iVal = stack.pop();
                System.out.println(iVal);
            }
        }catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    }
}