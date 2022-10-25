// Exceção para erros de fila cehia
package queue;

public class QueueFullException extends Exception {
    int size;

    QueueFullException (int size) {
        this.size = size;
    }

    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }
}