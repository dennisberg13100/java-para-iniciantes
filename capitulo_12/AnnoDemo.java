// Exemploo que usa @Deprecated

// Substitui uma classe
@Deprecated
class MyClass {
    private String msg;

    MyClass(String msg) {
        this.msg = msg;
    }

    // Subdtitúi o método de uma classe
    @Deprecated
    String getMsg() {
        return msg;
    }
}

class AnnoDemo {
    public static void main(String[] args) {
        MyClass myObj = new MyClass("test");

        System.out.println(myObj.getMsg());
    }
}