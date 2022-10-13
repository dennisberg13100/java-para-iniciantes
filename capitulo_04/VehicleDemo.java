/*
 *  Um origrama que usa a classe Vehicle.
 */

class Vehicle {
   int passengers;
   int fuelcap;
   int mpg;

   // Esse é um construtor para Vehicle
    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

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

// Essa classe declara um objeto do tipo Vehicle
class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan;        // declara uma referência ao objeto
        minivan= new Vehicle(7, 16, 21); // aloca um objeto Vehicle
        Vehicle sportcar = new Vehicle(2, 14, 12);

        System.out.println("Minivan can carry " + minivan.passengers + " passengers, wit the range of " + minivan.range() + " miles.");
        System.out.println("Sportcar can carry " + sportcar.passengers + "passengers, wit the range of " + sportcar.range() + " miles.");
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

        Vehicle car1 = new Vehicle(5, 14, 26);
        Vehicle car2 = car1;

        System.out.println("Car1 mpg: " + car1.mpg);
        // mesmo não sendo atribuida valor mpg ao car2 ele tem o mesmo valor d car 1 pois são o mesmo objeto
        System.out.println("Car2 mpg: " + car2.mpg);
    }
}