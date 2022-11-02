/* Exibe um arquivo de texto
 *
 * Para usar este programa, especifique
 * o nome do arquivo que você deseja ver.
 * Por exemplo para o arquivo chamado
 * text.txt, use a linha de comando abaixo.
 *
 * java ShowFile text.txt
 */

import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // Primeiro verifica se o nome do arquivo foi especificado
        if (args.length != 1) {
            System.out.println("usage: ShowFile <file>");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        } finally {
            // Fecha o arquivo em todos os casos
            try {
                if (fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error closing file!");
            }
        }
    }
}