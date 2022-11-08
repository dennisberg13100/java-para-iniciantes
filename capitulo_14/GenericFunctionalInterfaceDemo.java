// Uma interface funciopal genérica
// Interface funcional genérica com dois parâmetros que retorna um resultado boolean.

interface SomeTest<T> {
    boolean test(T n, T m);
}

class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Esta expressão determina se um inteiro é fator de outro
        SomeTest<Integer> isFactor = (n, d) -> (n % d ) == 0;

        if(isFactor.test(10,2))
            System.out.println("2 is facto of 10.");
        System.out.println();

        // A rpoxima expressão lambda determina se um Double é fator de outro
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if(isFactorD.test(212.0,4.0))
            System.out.println("4.0 is factor of 212.");
        System.out.println();

        // Esta expressão deremina se uma string faz parte de outra
        SomeTest<String> isIn = ( a, b) -> a.indexOf(b) != -1;
        String str = "GEneric Functional Interface";

        System.out.println("Testing string: " + str);

        if(isIn.test(str, "face"))
            System.out.println("'face' is found.");
        else
            System.out.println("'face' is not found.");
    }
}