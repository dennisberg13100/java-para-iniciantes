/*
    Este código demonstra uma variável.
 */

class Example2 {
    public static void main (String args[]) {
        int var1; // esta instrução declara uma variável
        int var2; // esta instrução declara outra variável

        var1 = 1024; // esta instrução atribui 1024 a var1

        System.out.println("var 1 contains " + var1);

        var2 = var1 / 2;

        System.out.print("Var 2 contains var1/2: ");
        System.out.println(var2);
    }
}