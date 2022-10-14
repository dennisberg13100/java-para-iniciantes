/*
 * Uma classe sue exibe a representação binária de um valor.
 */
class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        // desloca um 1 para a esquerda para a posição apropriada
        mask <<= numbits - 1;

        int spacer = 0;
        for( ; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0 ) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

// Demonstra ShowBits
class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 em binário:");
        b.show(123);

        System.out.println("\n87987 em binário:");
        i.show(87987);

        System.out.println("\n237658768 em binário:");
        li.show(237658768);

        // Você pode exibir os bits de ordem inferior de qualquer inteiro
        System.out.println("\nOs 8 bits de ordem inferior de 87987 em binário:");
        b.show(87987);
    }
}