// usa continue

class ContDemo {
    public static void main (String args[]) {
        int i;

        // exibe todos os números pares de 0 a 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0) continue;
            System.out.println(i);
        }
    }
}