// Usa a mesma interface funcional com três expŕessões lambda diferentes

interface NumericTest{
    boolean test(int n, int m);
}

class LambdaDemo2 {
    public static void main(String[] args) {
        // Esta expressão lambda determina se um número é fator de outro
        NumericTest isFActor = (n,d) -> (n % d) == 0;

        if(isFActor.test(10,2))
            System.out.println("2 is factor of 10.");
        if(!isFActor.test(3,10))
            System.out.println("3 is not factor of 10.");
        System.out.println();

        // Esta expressão lambda retorna true se o primeiro argumento for menor que o segundo
        NumericTest lessThan = (n, m) -> (n < m);

        if(lessThan.test(2, 10))
            System.out.println("2 is less than 10.");
        if(!lessThan.test(10,2))
            System.out.println("10 is not less than 2.");
        System.out.println();

        // Estra expressão retorna true se os valores absolutos dos argumentos forem iguais
        NumericTest absEquals = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if(absEquals.test(4, -4))
            System.out.println("Absolute values of 4 and -4 are equals.");
        if(!absEquals.test(4,-5))
            System.out.println("Absolute values of 4 e -5 are not equal.");
        System.out.println();
    }
}