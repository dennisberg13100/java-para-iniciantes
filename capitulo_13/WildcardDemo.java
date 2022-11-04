// Usa um coringa
class NumericFns<T extends Number> {
    T num;

    // Passa para o construtor uma referência a um objeto numérico
    NumericFns(T n) {
        num = n;
    }

    // Retorna o REciproco
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Retorna o componente fracionário
    double fractional() {
        return num.doubleValue() - num.intValue();
    }

    // Determina se os valores absolutos de dois objetos são iguais
    boolean absEqual(NumericFns<?> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}

// Demonstra um coringa
class WildcardDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        NumericFns<Long> lOb = new NumericFns<Long>(5L);

        System.out.println("Testing iOb and dOb:");
        if(iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println("Testing iOb and lOb.");
        if (iOb.absEqual(lOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}