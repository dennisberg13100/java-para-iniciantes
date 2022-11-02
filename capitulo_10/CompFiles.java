/*
 * Compara dois arquivos
 *
 * para usar este programa, especifique os nomes dos
 * arquivos a serem comparados na linha de comando.
 *
 * java CompFile first.txt second.txt
 */

import java.io.*;

class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;

        // Primeiro confirma se os dois arquivos foram especificados.
        if (args.length != 2) {
            System.out.println("Usage: CompFile <file1> <file2>");
            return;
        }

        // Compara os arquivos
        try(FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])){
            // Verifica o conteudo do arquivo
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}