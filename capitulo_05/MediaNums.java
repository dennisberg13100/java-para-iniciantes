// Programa que cancula a média de 10 valores

class MediaNums {
    public static void main(String[] args) {
        double[] val = { 52, 75, 36, 78, 96, 48, 75, 31, 45, 21};
        double result = 0;
        int index = 0;

        System.out.print("val = { ");

        for (double x : val) {
            index++;
            System.out.print(x);
            if(index != val.length)
                System.out.print(", ");
            result += x;
        }

        System.out.println(" }");

        result = result / val.length;

        System.out.println("A média dos valers de val é " + result);
    }
}