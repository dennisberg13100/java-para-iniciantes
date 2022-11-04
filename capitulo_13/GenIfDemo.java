// Exemplo de uma interface genérica

// Uma interface genérica que lida com armazenamento
// Essa interface requer uma classe usuária tenha um ou mais valores.

interface Containment<T> {
    // O método contains() verifica se um item especificado está
    // contido dentro de um objeto que implementa Containment.
    boolean contains(T o);
}

// Implementa Containment usando um array para armazenar valores.
class MyClass<T> implements Containment<T> {
    T[] arrayRef;

    MyClass(T[] o) {
        arrayRef = o;
    }

    // Implementa contains()
    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}

class GenIfDemo {
    public static void main(String[] args) {
        Integer x[] = {1,2,3};

        MyClass<Integer> ob = new MyClass<Integer>(x);

        if(ob.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");

        if(ob.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");
    }
}