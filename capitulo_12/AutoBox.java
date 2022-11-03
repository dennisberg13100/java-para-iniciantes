// Demonstra o autoboxing/unboxing

class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100; // faz o autobox de int

        int i = iOb; // autounboxing

        System.out.println(i + " " + iOb ); // Exibe 100 e 100
    }
}