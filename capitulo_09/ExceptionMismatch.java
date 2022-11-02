// Não funcionará
class ExceptionMismatch {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            // gera uma exceção de indices fora dos limites.
            nums[7] = 10;
        } catch(ArithmeticException exc) {
            // captura exceção
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement!");
    }
}