/*
 * Esta versão do programa ShowFile usa uma instrução
 * try-with-resources para fechar automaticamente um
 * arquivo quando ele não é mais necessário.
 */

import java.io.*;

class ShowFile2 {
    public static void main(String[] args) {
        int i ;

        // Primeiro, confirma se um nome de arquivo foi especificado
        if(args.length != 1) {
            System.out.println("Usage: java ShowFile2 <file>");
        }

        // O código a seguir usa try-with-resources para abrir um arquivo
        // e depois fechá-lo automaticamente quando o bloco try é finalizado.
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Exception: " + exc);
        }
    }
}