// Sobreposição de metodos
class A {
    int i, j;
    A (int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B (int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // exibe K, esta versão sobrepoem o show de A
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

class OverRide {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show();
    }
}