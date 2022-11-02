// Demonstra arquivos de acesso aleatório

import java.io.*;

class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25} ;
        double d;

        // Abre um arquivo de acesso aleatório
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            // Grava os valores no arquivo
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // Agora lê os arquivos de maneira aleatória
            raf.seek(0); // busca o primeiro valor double
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); // busca o segundo valor double
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(3 * 8); // busca o quarto valor double
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            // Agora, lê os valores alternadamente
            System.out.println("Here is every other value: ");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8 * i); // busca o i-ésimo valor
                d = raf.readDouble();
                System.out.print(d + " ");
            }
            System.out.println();
        }
        catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}