class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    // chamada quando o Objeto é reciclado
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    // gera um objeto que é imediatamente destruido
    void generatoar(int i) {
        FDemo o = new FDemo(i);
    }
}

class Finalize {
    public static void main(String args[]) {
        int count;
        FDemo obj = new FDemo(0);

        /*
         * Agora queremos um grande número de objetos
         * Em algum momento, a coleta de lixo ocorrená.
         * Nota: Você pode ter que aumentar o número
         * de objetos criados para forçar a coleta de
         * lixo
         */

        for (count = 0; count < 100000; count++) {
            obj.generatoar(count);
        }
    }
}
