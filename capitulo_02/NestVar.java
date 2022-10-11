/*
    Este programa tenta declara uma variável em
    um escopo interno com o mesmo nome de uma
    variável em um excopo externo.

    *** Este programa não será compilado ***
 */

class NestVar {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 10;  count++){
            System.out.println("This is count: " + count);

            int count; // inválido
            for (count = 0; count < 2; count ++) {
                System.out.println("This program is an error!");
            }
        }
    }
}