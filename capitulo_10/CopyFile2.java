/*
 * Versão de CopyFile que usa try-with-resources
 * lea demonstra dois recursos (neste caso arquivos)
 * gerenciados pela mesma intrução try.
 */

import java.io.*;

class CopyFile2 {
    public static void main(String[] args) {
        int i ;

        // Primeiro, confirma se os dois arquivos foram especificados
        if (args.length != 2) {
            System.out.println("Usage: java CopyFile2 <from> <to>");
            return;
        }

        // Abre e gerencia dois arquivos com a instrução try.
        try (
            FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])
        ) {
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Exception: " + exc);
        }
    }
}