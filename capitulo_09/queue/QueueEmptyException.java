// Uma exceção prara erros de fila vazia.
package queue;

public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}