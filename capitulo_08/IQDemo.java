// Classe de fila de tamanho fixo para caracteres.

class FixedQueue implements ICharQ {
    private char q[]; // esse é o array que contain a fila
    private int putloc, getloc; // os indices de put e get

    // Constói uma fila vazia dado o seu tamanho
    public FixedQueue (int size) {
        q = new char[size]; // aloca memória para a fila
        putloc = getloc = 0;
    }

    // Insere um caractere na fila
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println("  - Queue is full!");
            return;
        }
        q[putloc++] = ch;
    }

    // Removo um caractere da fila
    public char get() {
        if (getloc == putloc) {
            System.out.println("  - Queue is empty!");
            return (char) 0;
        }
        return q[getloc++];
    }
}

// Fila circular
class CircularQueue implements ICharQ {
    private char q[]; // aloca memória para a fila
    private int putloc, getloc; // os indices de put e get

    // Constói uma fila vazia dado o seu tamanho
    public CircularQueue(int size) {
        q = new char[size+1]; // aloca memória para a fila
        putloc = getloc = 0;
    }

    // Insere um caracterter na fila
    public void put(char ch) {
        /*
         * A fila estara cheia se putloc for uma unidade
         * menor que getloc, ou se putloc estiver no fim
         * do array e getloz estiver ni início.
         */
        if (putloc + 1 == getloc | ((putloc == q.length -1) & (getloc == 0))) {
            System.out.println("  - Queue is full!");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; // retrocede
    }

    // Remove um caractere da fila
    public char get() {
        if (getloc == putloc) {
            System.out.println("  - Queue is full!");
            return (char) 0;
        }
        char ch = q[getloc++];
        if(getloc == q.length) getloc = 0; // loop back
        return ch;
    }
}

// Fila Dinâmica
class DynQueue implements ICharQ {
    private char q[]; // essa array contèm a fila
    private int putloc, getloc; // Os índices de put e get

    // Condtrí uma fila vazia dado o seu tamanho
    public DynQueue (int size) {
        q = new char[size]; // alóca memória para a fila
        putloc = getloc = 0;
    }

    // Insere um caractere na fila.
    public void put(char ch) {
        if (putloc == q.length) {
            // aumenta o tamanho da fila
            char t[] = new char[q.length * 2];

            // copia os elementos para a nova fila
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }

        q[putloc++] = ch;
    }

    // removo um caractere da fila
    public char get() {
        if( getloc == putloc) {
            System.out.println("  - Queue is empty!");
            return (char) 0;
        }
        return q[getloc++];
    }
}

// Demostra a interface de ICharQ
class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        int i;

        iQ = q1;
        // Insere alguns caracteres na fila
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Exibe a fila
        System.out.println("Contents of the fixed queue:");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // Insere alguns caracteres na fila
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        // Exibe a fila
        System.out.println("Contents of the dynamic queue:");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        // Insere alguns caracteres na fila
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Exibe a fila
        System.out.println("Contents of the circular queue:");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        // Insere mais alguns caracteres na fila
        for (i = 0; i < 20; i++)
            iQ.put((char) ('A' + i));

        // Exibe a fila
        System.out.println("Contents of the circular queue:");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nStore and consume from circular Queue:");
        for (i = 0; i < 20; i++ ) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();
    }
}