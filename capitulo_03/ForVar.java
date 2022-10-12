// Declara a variável de controle de laço dentro de for

class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;

        // Calcula o fatorial dos números até 5
        for (int i = 1; i <= 5; i++) {
            sum += i; // i é conhecida aqui
            fact += i;
        }

        // mas i não pe conhecida aqui
        System.out.println("Sum is " + sum);
    System.out.println("Factorial is " + fact);
    }
}