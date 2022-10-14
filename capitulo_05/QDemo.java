// Uma classe de fila para caracteres

class Queue {
    char q[];
    int putloc, getloc;

    Queue (int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // insere um caractere na fila
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - The queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // obtém um caractere da fila
    char get() {
        if (getloc == putloc) {
            System.out.println(" - The queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}

// Demonstra a classe Queue.

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using the bigQ to store the alphabet.");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        System.out.println();

        System.out.println("Content of bigQ:");
        for (i = 0; i < 26; i++){
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smalQ to generate errors.");
        for (i = 0; i < 5; i++){
            ch = (char) ('Z' - i);
            System.out.print("Atempting to put " + ch);
            smallQ.put(ch);
            System.out.println();
        }

        System.out.println("Content of smallQ:");
        for (i = 5; i > 0; i--){
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println();

    }
}