// Tipos primitivos são passados por valor.

class Test {
    // Este argumento não causa alteração nos argumentso usados na chamada
    void noChange (int i, int j) {
        i = i + j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test obj = new Test();
         int a = 15;
         int b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        obj.noChange(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}