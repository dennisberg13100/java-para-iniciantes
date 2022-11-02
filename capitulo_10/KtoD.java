// Utilitário 'teclado para disco' simples que demonstra um FileWriter.

import java.io.*;

class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit):");

        try (FileWriter fw = new FileWriter("KtoD.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;
                str = str + "\r\n"; // adiciona uma nova linha
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}