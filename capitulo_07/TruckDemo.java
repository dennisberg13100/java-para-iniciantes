/*
 *  Um programa que usa a classe Vehicle.
 */

class Vehicle {
    private int passengers; // número de passageiros
    private int fuelcap;    // capacidade de armazenamento de combustível em galões
    private int mpg;        // consumo de combustível em milhas por galão

    // Esse é um construtor para Vehicle
    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Métodos de acesso as variáveis de instância
    int getPassengers() { return passengers;}
    void setPassengers(int p) { passengers = p;}
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg;}
    void setMpg(int m) { mpg = m; }


    // Exibe a autonomia
    int range()  {
        return fuelcap * mpg;
    }

    /*
     *  Adiciona um método parametrizado para calcular o combustível
     *  necessário para cobrir uma determinada distância.
     */

    double fuelNeeded (int miles) {
        return (double) miles / mpg;
    }
}

// Estende Vehicle para criar a especialização truck
class Truck extends Vehicle {
    private int cargocap; // capacidade de transporte de cargas em libras

    // Construtor para Truck
    Truck(int p, int f, int m, int c) {
        super(p,f,m);
        cargocap = c;
    }

    // Métodos acessores para cargocap
    int getCargocap() {return cargocap;}
    void setCargocap(int c) { cargocap = c;}

}

// Essa classe declara um objeto do tipo Vehicle
class TruckDemo {
    public static void main(String args[]) {
        Vehicle minivan;        // declara uma referência ao objeto
        minivan= new Vehicle(7, 16, 21); // aloca um objeto Vehicle
        Vehicle sportcar = new Vehicle(2, 14, 12);

        System.out.println("Minivan can carry " + minivan.getPassengers() + " passengers, wit the range of " + minivan.range() + " miles.");
        System.out.println("Sportcar can carry " + sportcar.getPassengers() + "passengers, wit the range of " + sportcar.range() + " miles.");
        System.out.println();

        if (minivan.range() > sportcar.range()) {
            System.out.println("Minivan has greater range.");
        } else {
            System.out.println("Sportcar has greater range.");
        }
        System.out.println();

        // Usando um método comparâmetros
        int dist = 252;
        double gallons;
        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles the minivan needs " + gallons + " gallons of fuel.");

        gallons = sportcar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles the sportcar needs " + gallons + " gallons of fuel.");
        System.out.println();

        // Constrói alguns caminhões
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi can carry " + semi.getCargocap() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargocap() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

        Vehicle car1 = new Vehicle(5, 14, 26);
        Vehicle car2 = car1;

        System.out.println("Car1 mpg: " + car1.getMpg());
        // mesmo não sendo atribuida valor mpg ao car2 ele tem o mesmo valor d car 1 pois são o mesmo objeto
        System.out.println("Car2 mpg: " + car2.getMpg());
    }
}