// Acesso público versus acesso privado

class MyClass {
    private int alpha;
    public int beta;
    int gama;

    /*
     * Método para acessar alfa. não há problema
     * em umm embro de um classe acessar um membro
     * privado da mesma classe.
     */

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}


class AccessDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        /* O acesso a alpha só pe érmitido pro intermédio
         * de seus métodos acessadores.
         */

        obj.setAlpha(-99);
        System.out.println("obj.alhpa is " + obj.getAlpha());

        // Você não pode acessar alpha dessa forma
        // obj.alpha = 10;

        // Estas linhas dão certo pois beta e gama são públicos.
        obj.beta = 88;
        obj.gama = 99;
    }
}
