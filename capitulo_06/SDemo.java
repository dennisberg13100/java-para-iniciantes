// Usa uma variável estático

class StaticDemo {
    int x; // uma variável de instância comum
    static int y; // uma variável estática

    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // Cada objeto tem a sua prṕria cópia de uma variável de instãncia comum
        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Of course, ob1.x and ob2.x are independent!");
        System.out.println("ob1.x:" + ob1.x);
        System.out.println("ob2.x:" + ob2.x);
        System.out.println();

        // Cada objeto compartilha uam cópia da variável estática
        System.out.println("The static variable is shared.");
        StaticDemo.y = 19;
        System.out.println("Set StaticDemo.y to 19");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Set StaticDemo.y to 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}