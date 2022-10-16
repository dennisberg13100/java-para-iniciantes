/*
 * Este programa imprime um string de tras para frente
 * utillizando um método recursivo;
 */

class InvStr {
    static void invert(String str) {
        inv(str, str.length() -1);
    }

    private static void inv(String str, int index) {
        System.out.print(str.charAt(index));
        if (index > 0)
            inv(str, index -1);
        else
            System.out.println();
    }
}

class InvertedString {
    public static void main(String[] args) {
        InvStr.invert("Dennis");
    }
}