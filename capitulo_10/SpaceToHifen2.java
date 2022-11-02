/* Este programa copia um arquivo de texto e converte todos os
 * espaçoes em hifens.
 */

import java.io.*;

class SpaceToHifen2 {
    public static void main(String[] args)
    throws IOException {
        int i;

        // Verifica se os dois arquivos foram especificados
        if(args.length != 2) {
            System.out.println("Usage: java SpaceToHifen <original file> <destination file>");
            return;
        }

        //Copia um arquivo e substitui os espaços por hifens
        try ( FileInputStream fin = new FileInputStream(args[0]);
              FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do {
                i = fin.read();
                if (i != -1) {
                    if ((char) i == ' ') i = (char) '-';
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Exception: " + exc);
        }
    }
}