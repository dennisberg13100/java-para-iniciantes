// Uma hierarqui8a de classes simples

// Uma classe para objetos com duas dimensões
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Construtor padrão
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Construto para objetos com altura e largura iguais
    TwoDShape(double x, String name) {
        width = height = x;
        this.name = name;
    }

    // Construtor parametrizado
    TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double width) { this.width = width; }
    void setHeight(double height) { this.height = height; }
    String getName() { return name; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    abstract double area();
}

// Uma subclasse de TwoShape para triângulo
class Triangle extends TwoDShape {
    private String style;

    // Construtor padrão
    Triangle() {
        super();
        style = "none";
    }

    // Construtor com apenas um parâmetro
    Triangle(double x) {
        super(x, "triangle");
        style = "filled";
    }

    // Construtor com largura e altura
    Triangle(String style, double width, double height) {
        super(width, height, "triangle");
        this.style = style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends TwoDShape {
      // construtor
    Rectangle(double width, double height) {
        super(width, height, "rectangle");
    }

    Rectangle(double x) {
        super(x, "square");
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
// cria auma subclasse circulos
class Circle extends TwoDShape {
    final double PI = 3.1415;

    Circle (double x) {
        super(x, "circle");
    }

    double area() {
        return  PI * Math.pow(getWidth(), 2);
    }

}

// Estende triangle
class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() { return color; }

    void showColor() {
        System.out.println("Color is " + color);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("filled", 4.0,4.0);
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle();
        ColorTriangle t4 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t5 = new ColorTriangle("Red", "filled", 2.0, 2.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println("\nInfo for t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println("\nInfo for t3:");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());

        System.out.println("\nInfo for t4:");
        t4.showStyle();
        t4.showDim();
        t4.showColor();
        System.out.println("Area is " + t4.area());

        System.out.println("\nInfo for t5:");
        t5.showStyle();
        t5.showDim();
        t5.showColor();
        System.out.println("Area is " + t5.area());

        Rectangle rec = new Rectangle(15.0, 20.0);
        System.out.println("\nInfo for rectangle:");
        System.out.println("Is this rectagle square?\n- " + rec.isSquare());
        System.out.println("The area of the rectangle is " + rec.area());

        TwoDShape shapes[] = new TwoDShape[5];

        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        shapes[4] = new Circle(2.0);


        for (int i = 0; i < shapes.length; i++ ) {
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}