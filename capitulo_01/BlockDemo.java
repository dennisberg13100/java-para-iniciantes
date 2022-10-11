/*
    Demonstra um bloco de código.
 */

class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;
        i = 2;
        j = 10;

        if (i != 0) {
            System.out.println("'i' does not equal zero.");
            d =  j/i;
            System.out.println("'j'/'i' = " + d);
        } else {
            System.out.println("You can not devide a number by 0!");
        }
    }
}