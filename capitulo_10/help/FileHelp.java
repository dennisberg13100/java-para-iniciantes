/*
 * Programa de ajuda que usa um arquivo em disco para
 * armazenar informações de ajuda.
 */

import java.io.*;

/* A classe help abre um arquivo de ajuda,
 * procura um tópico e exibe as informações
 * associadas a esse tópico.
 * Observe que ela mesma trata de todas as exceções
 * de I/O, evitando ser preciso chamar um
 * código que faça isso.
 */

class Help {
    String helpfile;

    Help (String helpfile) {
        this.helpfile = helpfile;
    }

    // Exibe ajuda sobre um tópico
    boolean helpOn (String what) {
        int ch;
        String topic, info;

        // Abre o arquivo de ajuda
        try(BufferedReader helpRder = new BufferedReader(new FileReader(helpfile))) {
            do {
                // Lẽ caractere até um # ser encontrado
                ch = helpRder.read();

                // agora vê se os tópicos coincidem
                if (ch == '#') {
                    topic = helpRder.readLine();
                    if (what.compareTo(topic) == 0) { //topico encontrado
                        do {
                            info = helpRder.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while(ch != -1);
        } catch (IOException exc) {
            System.out.println("Error accessing helpfile.");
        }
        return false; // Tópico não encontrado
    }

    // Acessa o tópico de ajuda.
    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        } catch(IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
}

// Demonstra o sistema de ajuda baseado em arquivo
class FileHelp {
    public static void main(String[] args) {
        Help hlpObj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. Enter 'stop' to end.");

        do {
            topic = hlpObj.getSelection();
            if(topic.compareTo("stop") == 0) break;
            if (!hlpObj.helpOn(topic))
                System.out.println("topic not found.\n");
        } while(topic.compareTo("stop") != 0);
    }
}