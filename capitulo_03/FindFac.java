/*
    Usa laços aninhados para encontrar os fatores
    dos números de 2 a 100
 */

class FindFac {
    public static void main (String args[]) {
        for ( int i = 2; i <= 100; i++) {
            System.out.print("Factors os " + i + ": ");
            for (int j = 2; j < i; j++) {
                if((i%j) == 0) System.out.print(j + " ");
                if (i / 2 > j) continue;
            }
            System.out.println();
        }
    }
}