// Lê um string no console usando um BufferReader
import java.io.*;

class ReadLines {
    public static void main(String[] args)
    throws IOException {
        // Cria um buffer usando System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'Stop' to quit.");

        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }
}