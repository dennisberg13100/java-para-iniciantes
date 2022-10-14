// O laço de for-each é apenas de leitura

class NoChange {
    public static void main(String[] args) {
        int nums[] = new int [10];
        for (int i = 0; i < 10; i++)
            nums[i] = i + 1;

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // sem efeito sobre nums
        }

        System.out.println();

        for (int x : nums)
            System.out.print(x + " ");

        System.out.println();
    }
}