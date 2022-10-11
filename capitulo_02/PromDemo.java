// O inesperado em uma promoção!

class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i ;

        b = 10;
        i = b * b; // Certo aqui não é necessário uma correção

        b = 10;
        b = (byte) (b * b); // Correção é necessária.

        System.out.println("i and b: " + i + " " + b);
    }
}