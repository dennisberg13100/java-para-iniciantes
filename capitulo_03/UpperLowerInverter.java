/*
    This porogram will convert all to upper caracters
    to lower and all the lower caracter to upper.
 */

class UpperLowerInverter {
    public static void main(String args[])
    throws java.io.IOException {
        System.out.println("Digite um texto:");
        char ch;

        do {
            ch = (char) System.in.read();

            if (ch >= 'a' && ch <= 'z'){
                System.out.print((char) (ch - 32));
            } else if (ch >= 'A' && ch <= 'Z'){
                System.out.print((char) (ch + 32));
            } else {
                System.out.print(ch);
            }

        } while (ch != '\n');

        System.out.println();
    }
}