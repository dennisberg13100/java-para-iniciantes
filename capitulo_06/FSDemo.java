/*
 * Esta class implementa uma array "resistente a falhas"
 * que impede a ocorrência de erros em tempo de execução.
 */

class FailSoftArray {
    private int a[]; // referência ao array
    private int errval; // valor a ser retornado se get() falhar
    public int length; // length é pública

    /*
     * Constói o array dados o seu tamanho e valor
     * a ser retornado se get() falhar.
     */

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Retorna o valor do índice especificado
    public int get(int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }

    // Insere um valor em um índice. Retorna falso em caso de falha
    public boolean put(int index, int val) {
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Retorna true se o indice estiver dentro dos limites
    private boolean indexOK(int index) {
        if(index >= 0 & index < length) return true;
        return false;
    }
}

// Demonstra o array resistente a falhas
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // exibe falhas silenciosas
        System.out.println("Fail quietly.");
        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10);

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println();

        // agora, trata as falhas
        System.out.println("\nFail with error reports.");
        for (int i = 0; i < (fs.length * 2); i++)
            if(!fs.put(i, i * 10))
                System.out.println("Index " + i + " out-of-bounds");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1)
                System.out.print(x + " ");
            else
                System.out.print("\nIndex " + i + " out-of-bounds");
        }
        System.out.println();




    }
}