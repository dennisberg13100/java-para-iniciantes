// Interface da fila de caracteres
package queue;

public interface ICharQ {
    // insere um caractere na fila
    void put(char ch) throws QueueFullException;

    // Remove um caractere da fila
    char get() throws QueueEmptyException;
}