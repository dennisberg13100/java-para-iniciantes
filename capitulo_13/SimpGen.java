// classe genérica simples com dois parâmetros de tipo: P e V
class TwoGen<T, V> {
    T ob1;
    V ob2;

    // Passe para o construtor referências a objetos de tipo T e V
    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    // Exibe os tipos T e V
    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

// Demosntra TwoGem
class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

        // Exibe os tipos
        tgObj.showTypes();

        // Obtèm e exibe os valores
        int v = tgObj.getOb1();
        System.out.println("Value: " + v);
        String str = tgObj.getOb2();
        System.out.println("Value: " + str);
    }
}