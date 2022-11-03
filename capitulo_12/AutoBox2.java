// o autoboxing/unboxing ocorre com parâmetros
// e valores de retorno de métodos.

class AutoBox2 {
    // Este método tem um parâmetro integer;
    static void m(Integer v) {
        System.out.println("m() recived " + v);
    }

    // esse método retorna um int.
    static int m2() {
        return 10;
    }

    // esse método retorna um integer
    static Integer m3() {
        return 99; // faz o autoboxing de 99 para Integer
    }

    public static void main(String[] args) {
        // passa um valor int para m(). Já que m() têm um parâmetro Int
        // o valor int é encapsulado automaticamente.
        m(199);

        // Aqui iOb recebe o valor retornado por m2().
        // esse valor é encapsulado automáticamente para
        // poder ser atribuído a iOb.
        Integer iOb = m2();
        System.out.println("Return value from m() is " + iOb);

        // Em seguid, m3() é chamado. Ele retorna um valor Integer
        // que é encapsulado eutomaticamente em um int.
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        // Agora, Math.sqrt() é chamado com iOb como argumento.
        // Nesse caso, iOb sofre autounboxing e seu valor é promovido
        // a double, que é o tipo que sqrt() precisa.

        iOb = 100;
        System.out.println("Square root of iOB is " + Math.sqrt(iOb));
    }
}