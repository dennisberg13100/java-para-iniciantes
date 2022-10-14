// Classifica uma array de strind em ordem alfabetica

class ClsArray {
    public static void main(String[] args) {
        String[] str = {"tartaruga", "elefante", "gorila", "zebra", "babuino", "coiote", "camelo", "girafa", "javali", "leão"};

        System.out.println("Lista antes de ser ordenada:");
        for (String s : str)
            System.out.print(s + " ");
        System.out.println();

        for (int i = str.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                String temp;
                if ((str[j].compareTo(str[j+1])) > 0) {
                    temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] =temp;
                }
            }
        }

        System.out.println("Lista após ser ordenada:");
        for (String s : str)
            System.out.print(s + " ");
        System.out.println();

    }
}