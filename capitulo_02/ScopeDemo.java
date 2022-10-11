// Demonstra o escopo de bloco.

class ScopeDemo {
    public static void main(String args[]) {
        int x = 10;

        if (x == 10) {
            int y = 20;

            // tanto x como y são conhecidas aqui.
            System.out.println("x and y : " + x + " " + y);
            x = y * 2;
        }
        // y = 100; error: cannot find symbol

        System.out.println("x is " + x);

    }
}