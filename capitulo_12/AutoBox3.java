// Autoboxing/unboxing ocorre dentro de expressões

class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 99;
        System.out.println("Original value of iOb: " + iOb);

        // O trecho a seguir faz o unboxing automático
        // de iOb, executa o incremento e encapśule
        // o resultado em iOb;
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        // Aqui, iOb sofre unboxing, seu valor é aumentado em 10 e o
        // resultado é encapsulado em iOb.
        iOb += 10;
        System.out.println("After iOb += 10: " + iOb);

        // Agora iOb sofer unboxing, a expressão é
        // avaliada e o resultado é encapsulado novamente
        // e atribuído a iOb2.
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        // A mesma expressão é avaliada, mas o resultado não é encapsulado
        i  = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);
    }
}