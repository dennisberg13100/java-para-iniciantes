// Usa uam referência a um método de instância

// interface funcional para predicados numéricos que operam com
// valores inteiros

interface IntPredicate {
    boolean test(int n);
}

/* Esta classe armazena o valor int e define o método de
 * instância isFactor(), que retorna true quando seu argumento
 * é fator do valor armazenado
 */

class MyIntNum {
    private int v;

    MyIntNum(int x) {v = x; }

    int getNum() { return v; }

    // Retorna true se n for fator de v
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;
        MyIntNum myNum1 = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Aqui uma referência ao método isFActor é criada em myNum
        IntPredicate ip = myNum1::isFactor;

        // Agora ela é usada para chamar isFactor() via test()
        result = ip.test(3);
        if(result) System.out.println("3 is factor of " + myNum1.getNum());

        ip = myNum2::isFactor;

        // Agora ela é usada para chamar isFactor() via test()
        result = ip.test(3);
        if(!result) System.out.println("3 is not factor of " + myNum2.getNum());
    }
}