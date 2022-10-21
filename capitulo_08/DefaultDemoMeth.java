// Implementa MyIF
class MyIFImp implements MyIF {
    public int getUserID() {
        return 100;
    }
}

// Usa o método padrão
class DefaultDemoMeth {
    public static void main(String[] args) {
        MyIFImp ob = new MyIFImp();

        System.out.println("User ID is: " + ob.getUserID());
        System.out.println("Admin ID is: " + ob.getAdminID());
    }
}