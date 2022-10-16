// Um exemplo simples de recursão

class Factorial {
    // Recursive implementation
    int factR(int n) {
        int result;

        if(n == 1) return 1;
        result = factR(n-1) * n;
        System.out.println("n: " + n + " result: " + result);
        return result;
    }


    // Interactive implementation
    int factI(int n) {
        int t, result;

        result = 1;
        for(t = 1; t <= n; t++)
            result *= t;

        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial Using recursive methode.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorial Using iterative methode.");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
        System.out.println();
    }
}