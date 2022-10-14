// Algumas operações com string

class StrOps {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programing, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerfull.";
        int result, idx;
        char ch;

        System.out.println("Length of str1: " + str1.length());

        // Exibe um caractere de cada vez de str1
        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i) + "|");
        System.out.println();

        if (str1.equals(str2))
            System.out.println("str1 equal str2!");
        else
            System.out.println("str1 does not equals str2!");

        if (str1.equals(str3))
            System.out.println("str1 equals str3!");
        else
            System.out.println("str1 does not equals str3!");

        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 equals to str3!");
        else if (result < 0)
            System.out.println("Str1 is smaller than str3!");
        else
            System.out.println("str1 is greater than str3!");

        // atribui um novo valor a str2
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Index of the first occurrence of One is: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of the last occurrence od one is: " + idx);
    }
}