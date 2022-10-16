// Objetos são passados pelas suas refeências

class Test {
    int a, b;

    Test (int a, int b) {
        this.a = a;
        this.b = b;
    }

    /*
     * Passa um objeto.
     * Neste caso os valores de obj.a e obj.b serão alterados.
     */

    void change (Test obj) {
        obj.a = obj.a + obj.b;
        obj.b = -obj.b;
    }
}

class PassObjRef {
    public static void main(String[] args) {
        Test obj = new Test(15, 20);

        System.out.println("obj.a and obj.b before the call: " + obj.a + " " + obj.b);
        obj.change(obj);
        System.out.println("obj.a e obj.b after the call: " + obj.a + " " + obj.b);
    }
}