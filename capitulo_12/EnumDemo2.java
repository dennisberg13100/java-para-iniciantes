// Usa os métodos de enumeração internos
// Enumeração dos meios de transporte

enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;
        System.out.println("Here are all the Transport constants:");

        // Usa values()
        Transport allTransports[] = Transport.values();
        for (Transport t : allTransports)
            System.out.println(t);

        System.out.println();

        // Usa valueOf()
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains: " + tp);
    }
}