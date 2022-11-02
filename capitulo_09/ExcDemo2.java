/*
 * Uma exceção pode ser gerada por u
 * metodo e capturado por outro.
 */

class ExcTest {
    // Gera uma exceção
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // gera uma exceção de índice fora dos limites.
        nums[7] = 10;
        System.out.println("This won't be displayed.");
    }
}

class ExcDemo2 {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        } catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}