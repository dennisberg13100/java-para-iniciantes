// Demonstra os valores boleanos

class BoolDemo {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " +b);

        // Um valor boleano pode controlar a intrução if
        if (b) System.out.println("This is executed!");

        b = false;
        if (b) System.out.println("This is not executed!");

        // o reesultado de um operdor relacional é um valor booleano
        System.out.println("10 > 9 is " + (10 > 9));
    }
}