/* Copia uma arquivo de texto
 * pára usar este programa, especifique o nome do
 * arquivo de origem e do arquivo de destino.
 * Por exempli, para copiar um arquico chamado first.txt
 * em um arquivo chamado second.txt, use a linha de comando
 * a seguir.
 *
 * java CopyFile fist.txt second.txt
 */

import java.io.*;

class CopyFile {
    public static void main(String[] args)
    throws IOException {
        int i ;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Primeiro verifica se os dois arquivos foram especificados
        if (args.length != 2) {
            System.out.println("Uasge: CopyFile <from> <to>");
            return;
        }

        // Copia um arquivo
        try {
            // Tenta abrir os arquivos
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing input file!");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Error closing output file!");
            }
        }
    }
}