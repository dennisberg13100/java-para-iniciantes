// Uma classe de fila para caracteres melhorada

class Queue {
    // agora estes membros são privados
    private char q[];
    private int putloc, getloc;

    Queue (int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // Constroi uma fila a partir de outra
    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // copia os elementos
        for (int i = getloc; i < putloc; i++)
            q[i] = ob.q[i];
    }

    // Constrói uma fila com valores iniciais
    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length];

        for (int i = 0; i < a.length; i++)
            put(a[i]);
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

        // constrói uma fila vazia para 10 elementos
        Queue q1 = new Queue(10);

        char name[] = {'T', 'O', 'M'};
        // Constrói uma fila a partir de uma array
        Queue q2 = new Queue(name);

        // Insere alguns caracteres em q1
        for ( i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // Constrói uma fila a partir de outra
        Queue q3 = new Queue(q1);

        // Exibe as filas
        System.out.print("Contentes of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println();

        System.out.print("Contentes of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println();


        System.out.print("Contentes of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
        System.out.println();
    }
}