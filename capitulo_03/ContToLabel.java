// Usa continue com um  rótulo

class ContToLabel {
    public static void main(String args[]) {
        outerloop:
        for (int i = 0; i < 10; i++) {
            System.out.println("\nOuter loop pass " + i + " inner loop: ");
            for (int j = 1; j < 10; j++ ) {
                if (j == 5) continue outerloop;
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}