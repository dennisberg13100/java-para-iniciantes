// Demonstra a sobrecarga de métodos

class Overload {
    void ovlDemo() {
        System.out.println("No parameters.");
    }

    // sobrecarga de ovlDemo para um parâmetro inteiro
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    // sobrecarga de ovlDemo para dois parâmetros inteiros
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // sobrecarga para dois parametros double
    double ovlDemo( double a, double b) {
        System.out.println("Two double parametrers: " + a + " " + b);
        return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // chama todas as verões de ovlDemo
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("The result of ovlDemo(4,6) is " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("The result of ovlDemo(1.1, 2.32) is " + resD);
        System.out.println();
    }
}