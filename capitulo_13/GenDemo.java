// Classe genérica simples
// Aqui T é um parâmertro de tipo que
// será substituiído pelo tipo real quando
// um objeto de tipo Gen for criado

class Gen<T> {
    T obj; // declara um Objeto do tipo T

    // Passa para o construtor uma referência a um objeto de tipo T
    Gen(T obj) {
        this.obj = obj;
    }

    // Retorn obj
    T getGen() {
        return obj;
    }

    // Exibe o tipo de T
    void showType() {
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}

// Demonstra a classe genérica
class GenDemo {
    public static void main(String[] args) {
        // Cria uma referância Gen para Integers.
        Gen<Integer> iOb;

        // Cria um oibjeto genérico Gen<Integer> e atribui sua referência a iOb.
        // Observe o uso de autoboxing no encapsulamento do valor 88 dentro do objeto Integer.
        iOb = new Gen<Integer>(88);

        // exibe o tipo de dado usado por iOb.
        iOb.showType();

        // Obtém o valor de iOb, observe que nenhuma coerção é necessária.
        int v = iOb.getGen();
        System.out.println("value: " + v);

        System.out.println();

        // Cria um objeto Gen para Strings
        Gen<String> strOb = new Gen<String>("Generics test!");

        // Exibe o tipo de dado usado por strOb
        strOb.showType();

        // Obtém o valor de strOb. Novamente observe que nenhuma coerção é necessária.
        String strg = strOb.getGen();
        System.out.println("Value: " + strg);
    }
}

