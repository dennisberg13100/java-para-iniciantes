// Usa uma referência de método de instância para referenciar
// qualquer instância

// Interface funcional para predicados numéricos que opera com um
// objeto de tip MyIntNum e um valor inteiro
interface MyIntNumPredicate {
    boolean test(MyIntNum mv, int n);
}

// Esta classe armazena um valor int e define o método
// de instância isFActor(), que retorn true quando seu
// argumento é fator do valor armazenado

class MyIntNum {
    private int v;

    MyIntNum(int x) { v = x; }

    int getNum() { return v; }

    // Retorna true se n for fator de v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

class MethodRefDemo3{
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Esta instância faz inp referenciar o método de instância isFActor().
        MyIntNumPredicate inp = MyIntNum::isFactor;

        // A instrução a seguir chama isFactor() em myNum;
        result = inp.test(myNum, 3);
        if(result)
            System.out.println("3 is fator of " + myNum.getNum());

        result = inp.test(myNum2, 3);
        if(!result)
            System.out.println("3 is not fator of " + myNum2.getNum());

    }
}
