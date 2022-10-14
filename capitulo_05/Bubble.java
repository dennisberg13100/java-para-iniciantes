// Um sistema de classificação de arrays bem simples (e ineficiente)

class Bubble {
    public static void main(String args[]) {
        int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int i, j, t, size;

        size = 10;

        // exibe a array orginal
        System.out.println("Original array is:");
        for (i = 0; i < size; i++) {
            System.out.print(nums[i]);
            if (i < size-1) System.out.print(", ");
        }
        System.out.println("\n");

        // essa é a classificação por bolha
        for (i = 1; i < size; i++) {
            for (j = size -1; j >= i; j--) {
                if (nums[j-1] > nums[j]) { // se fora de ordem
                    //swap
                    t = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = t;
                }
            }
        }

        // exibe o array classificado
        System.out.println("Sorted array is:");
        for (i = 0; i < size; i++) {
            System.out.print(nums[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println();
    }
}