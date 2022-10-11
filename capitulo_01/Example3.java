/*
    Esse programa ilustra a diferença entre int e double
 */

class Example3 {
    public static void main(String args[]) {
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println();

        // Agora divide as duas por quatro
        var = var / 4;
        x = x / 4;

        System.out.println("Var after division: " + var);
        System.out.println("X afer division: " + x);
    }
}