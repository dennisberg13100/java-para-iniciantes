// Classe genérica de pilha de um tamanho fixo
class Stack<T> implements IStack<T> {
    private T stack[]; // essa array contém a pilha
    private int index; // índice de inserção e retirada

    // constrói uma pilha vazia com a array dada
    public Stack(T[] stack) {
        this.stack = stack;
        index = 0;
    }

    // Insere um item na pilha
    public void push(T obj) throws StackFullException {
        if (index == stack.length)
            throw new StackFullException(stack.length);
        stack[index++] = obj;
    }

    // Retira um item da pilha
    public T pop() throws StackEmptyException {
        if(index == 0)
            throw new StackEmptyException();

        return stack[--index];
    }
}