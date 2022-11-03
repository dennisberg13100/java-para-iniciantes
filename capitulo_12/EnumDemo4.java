// Demonstra ordinal() e compareTo()

// Enumeração de meios de transporte
enum Transport {
    CAR, TRUCK, AIRPLAIN, TRAIN, BOAT
}

class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp1, tp2, tp3;

        // Obtém todos os valores ordinais usando ordinal().
        System.out.println("Hera are all transport constants and their ordinal values.");
        for (Transport t : Transport.values())
            System.out.println(t + " " + t.ordinal());

        tp1 = Transport.AIRPLAIN;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLAIN;

        if(tp1.compareTo(tp2) < 0)
            System.out.println(tp1 + " comes before " + tp2);
        if(tp1.compareTo(tp2) > 0)
            System.out.println(tp2 + " comes before " + tp1);
        if(tp1.compareTo(tp3) == 0)
            System.out.println(tp1 + " equals " + tp3);
    }
}