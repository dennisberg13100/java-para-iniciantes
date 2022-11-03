// Encontra as soluções de uma equação quadratica
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Quadratic {
    public static void main(String[] args) {
        // a, b, c representam os soeficientes da
        // equação quadratica: ax² + bx + c = 0
        double a, b, c, x;

        // Resolve 4x² + x - 3 = 0 para achar x
        a = 4;
        b = 1;
        c = -3;

        // Encontra a primeira solução
        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution : " + x);

        // Encontra a segunda solução
        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution : " + x);
    }
}