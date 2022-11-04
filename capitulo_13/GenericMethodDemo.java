// Demonstra um método genérico simples
class GenericMethodDemo {
    // Determina se o conteúdo de duas arrays é igual
    static <T extends Comparable<T>, V extends T> boolean arrayEquals(T[] x, V[] y){
        // Se o tamanho das arrays for diferente, os arrays também serão
        if(x.length != y.length) return false;

        for(int i = 0; i < x.length; i++)
            if(!x[i].equals(y[i])) return false; // os arrays são diferentes

        return true; // o conteúdo dos arrays são equivalentes
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};

        if(arrayEquals(nums, nums))
            System.out.println("nums equals nums.");
        if(arrayEquals(nums, nums2))
            System.out.println("nums equals nums2.");
        if(arrayEquals(nums, nums3))
            System.out.println("nums equals nums3.");
        if(arrayEquals(nums, nums4))
            System.out.println("nums equals nums4.");
    }
}