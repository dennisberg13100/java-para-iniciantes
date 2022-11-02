// Lança manualmente uma exceção

class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
        } catch (ArithmeticException exc) {
            System.out.println("Excepion caught!");
        }
        System.out.println("After try/catch block.");
    }
}