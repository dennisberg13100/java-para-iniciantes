// Utilitário 'disco para tela' simples que demonstra um FileReader
import java.io.*;

class DtoS {
    public static void main(String[] args) {
        String s;

        // Cria um FileReader encapsulado em um BufferREader.
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt")))
        {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        }
    }
}