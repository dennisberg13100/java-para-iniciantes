// Uma Interface pode extender outra
interface A {
    void methA();
    void methB();
}

interface B extends A {
    void methC();
}

// Esta classe deve implementar tudo que contêm em interface A e B
class MyClass implements B {
    public void methA() {
        System.out.println("Implements methA().");
    }
    public void methB() {
        System.out.println("Implements methB().");
    }
    public void methC() {
        System.out.println("Implements methC().");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.methA();
        ob.methB();
        ob.methC();
    }
}