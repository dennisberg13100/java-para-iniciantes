// Exceção para essos de fila vazia
public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is Empty.";
    }
}