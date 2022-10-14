// Um laço for de estilo for-each

class ForEach {
    public static void main(String[] args) {
        int nums[] = new int[10];
        for (int i = 0; i< 10; i++)
            nums[i] = i + 1;
        int sum = 0;

        // Usa o laço for de estilo foreach para exibir e somar os vaolers de nums
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}