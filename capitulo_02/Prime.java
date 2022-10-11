/*
    Este programa imprimi todo sos números primos
    entre 2 e 100
 */

class Primes {
    public static void main(String args[]) {
        int i, j;

        for (i = 2; i <= 100 ; i++) {
            boolean show = true;
            for (j = 1; j < i; j++) {
                if ((j != 1) && (i % j == 0) )
                    show = false;
            }
            if (show)
                System.out.println(i);
        }

    }
}