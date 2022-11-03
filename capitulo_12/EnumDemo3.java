// Usa um construtor, uma variável de instância e um método de enumeração
enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed;

    // Construtor
    Transport(int s) { speed = s; }

    int getSpeed() { return speed; }
}

class EnumDemo3 {
    public static void main(String[] args) {
        Transport tp;

        // Exibe a velocidade de uma avião
        System.out.println("Tipical speed of a airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.\n");

        // Exibe todos os tranportes e velocidades
        System.out.println("All transports and speeds:");
        for(Transport t : Transport.values())
            System.out.println(t + " tipical speed is " + t.getSpeed() + " miles per hour.");

    }
}