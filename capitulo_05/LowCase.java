// Letras minúsculas

class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // Essa instrução ativa o sexto bit
            ch = (char) ((int) ch | 32); // 32 = 00000000 00100000
            System.out.print(ch + " ");
        }

        System.out.println();
    }
}