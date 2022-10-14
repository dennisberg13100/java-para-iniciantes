// Letras maiúsculas

class UpperCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // Essa instrução desativa o 6° bit
            ch = (char) ((int) ch & 65503); // 65503 = 11111111 11011111

            System.out.print(ch + " ");
        }
        System.out.println();
    }
}