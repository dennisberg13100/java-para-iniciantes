// Interface para pilha genérica
public interface IStack<T> {
    // Insere um valor na pilha
    void push (T x) throws StackFullException;

    // Retira um valor da pilha
    T pop() throws StackEmptyException;

}