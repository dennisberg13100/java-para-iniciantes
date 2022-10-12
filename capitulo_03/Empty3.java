// O corpo de um laço pode estar vazio

class Empty3 {
    public static void main(String args[]) {
        int i;
        int sum = 0;

        // soma dos números até 5
        for (i = 0; i <= 5; sum += i++);

        System.out.println("Sum is " + sum);
    }
}