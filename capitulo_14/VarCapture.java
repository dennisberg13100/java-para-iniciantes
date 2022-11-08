// Exemplo de captura de uma variável local do escopo externo

interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {
        // Uma variável local pode ser capturada
        int num = 10;

        MyFunc myLambda = (n) -> {
            // este uso de num está correto, ele não modifica num.
            int v = num + n;

            // porém a instrução a seguir não é valida pois ela tenta modificar o valor de num
            // num++;

            return v;
        };

        // Usa a expressão lambda. Esta exibição exibirá 18.
        System.out.println(myLambda.func(8));


        // a linha a seguir também causaria um erro pois removeria de num o status de efetivamente final
        // num = 9;
    }
}