// Usando Break para sair de u laço

class BreakDemo {
    public static void main(String args[]) {
        int num = 100;

        // executa o laço enquanto i ao quadrado for meno do que num
        for (int i = 0; i < num; i++) {
            if (i*i >= num) break;
            System.out.print(i + " ");
        }
        System.out.println("Loop complete!");
    }
}