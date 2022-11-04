// Nesta versão de NumericsFns, o argumento de tipo T deve ser Number
// ou uma classe derivada de Number.

class NumericFns<T extends Number> {
    T num;

    // Passa para o construtor uma fererência a um objeto numérico
    NumericFns(T n) {
        num = n;
    }

    // Retorna o recíproco
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Retorna o componente fracionário
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}

// Demonstra NumericsFns.
class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);

        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());
        System.out.println();

        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        System.out.println("Reciprocal of iOb is " + dOb.reciprocal());
        System.out.println("Fractional component of iOb is " + dOb.fraction());

    }
}

