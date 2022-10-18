// Usando super para resolver problema de ocultação de nomes
class A {
    int i;
}

// Cria uma subclasse que extende a classe A
class B extends A {
    int i; // Essa variável oculta a variável i de A

    B(int a, int b) {
        super.i = a;    // i de A
        i = b;          // i de B
    }

    void show() {
        System.out.println("i in supperclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1,2);

        subOb.show();
    }
}