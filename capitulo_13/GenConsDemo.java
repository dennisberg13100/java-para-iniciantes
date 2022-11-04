// Usa um construtor genérico
class Summation {
    private int sum;

    <T extends Number> Summation(T args) {
        sum = 0;
        for (int i = 0; i < args.intValue(); i++)
            sum += i;
    }

    int getSum() {
        return sum;
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(4.0);
        System.out.println("Summation of 4.0 is " + ob.getSum());
    }
}