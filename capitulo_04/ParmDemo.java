// Um exemplo simples que usa um parâmetro

class ChkNum {
    // return true se x for par
    boolean isEven(int x) {
        if((x % 2) == 0) return true;
        else return false;
    }

    // retorn true se a for fator de b
    boolean isFactor(int a, int b) {
        if ((b % a ) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String args[]) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 is even.");
        if (e.isEven(9)) System.out.println("9 is even.");
        if (e.isEven(8)) System.out.println("8 is even.");
        System.out.println();

        if (e.isFactor(2, 20)) System.out.println("2 is factor of 20.");
        if (e.isFactor(3, 20)) System.out.println("3 is factor of 20.");
    }
}