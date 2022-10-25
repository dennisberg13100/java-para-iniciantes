/*
 *  Pilha ou Stack
 *
 *  esta classe sria uma pilha de caracteres, o primeiro a entrar
 *  será o último a sair. Ela possui duas funções, push() para
 *  adicionar um caractere no final da pilha e pop() para retornar
 *  o caractere que estiver no top a pila.
 */

class Stack {
    private char stack[];
    private int index = 0;
    private boolean empty = true;

    Stack(int size) {
        stack = new char[size];
        System.out.println("A new stach with a size of " + size + " is created.");
    }

    void push(char ch)
    throws StackFullException{
        if (index < stack.length) {
            stack[index++] = ch;
            empty = false;
        } else {
            throw new StackFullException(stack.length);
        }
    }

    void pop()
    throws  StackEmptyException {
        if (!empty) {
            System.out.println(stack[--index]);
            if (index == 0) {
                index = 0;
                empty = true;
            }
        } else {
            throw new StackEmptyException();
        }
    }
}

class StackDemo {
    public static void main(String[] args) {
        Stack stk1 = new Stack(10);
        Stack stk2 = new Stack(5);
        char ch;

        System.out.println("\nEnchendo a plilha stk1 inteira:");
        for (int i = 0; i < 10; i++) {
            try {
                ch = (char)('A' + i);
                stk1.push(ch);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }

        System.out.println("\nColocando 6 valores em uma pila de 5 valores:");
        for (int i = 0; i < 6; i++) {
            try {
                ch = (char)('Z' -i);
                stk2.push(ch);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }

        System.out.println("\nRetornando 11 valores da pilha de 10:");
        for (int i = 0; i <= 10; i++) {
            try {
                stk1.pop();
            } catch (StackEmptyException exc) {
                System.out.println(exc);
            }
        }
    }
}