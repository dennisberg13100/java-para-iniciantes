// Objetos podem ser passados para os métodos

class Block {
    int a, b, c;
    int volume;

    Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    void description() {
        System.out.println("The size of this block is " + a + " x "  + b + " x " + c);
        System.out.println("It has a volume of " + volume);
    }

    // Retorna true se o objeto definir o memso bloco
    boolean sameBlock(Block obj) {
        if ((obj.a == a) && (obj.b == b) && (obj.c == c))
            return true;
        return false;
    }

    // Retorna true se os dois objetos tiverem o mesmo volume
    boolean sameVolume(Block obj) {
        if (obj.volume == volume) return true;
        return false;
    }
}

class PassObj {
    public static void main(String[] args) {
        Block obj1 = new Block(10,2,5);
        Block obj2 = new Block(10,2,5);
        Block obj3 = new Block(4,5,5);

        obj1.description();

        System.out.println("obj1 hass the same dimensions of obj2: " + obj1.sameBlock(obj2));
        System.out.println("obj1 hass the same dimensions of obj3: " + obj1.sameBlock(obj3));
        System.out.println("obj1 hass the same volume of obj3: " + obj1.sameVolume(obj3));
    }
}