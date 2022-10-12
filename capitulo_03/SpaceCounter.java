/*
    Este programa recebe uma entrada do usuário
    e conta quantos espaços tem
 */

class SpaceCounter {
    public static void main (String args[])
    throws java.io.IOException {
        char ch;
        int spaces = 0;

        System.out.println("Digite alguma coisa e de ENTER:");
        do {
            ch = (char) System.in.read();
            if (ch == ' ')
                spaces++;
        } while (ch != '\n');

        System.out.println("Spaces: " + spaces);
    }
}