// Subclasses devem preceder superclasses em instruções catch

class ExcDemo5 {
    public static void main(String[] args) {
        // Aqui numer é maior que denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            try{
                System.out.println(numer[i] + "/" + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Can't devide by zero.");
            } catch (Throwable exc) {
                System.out.println("some Exception ocourred.");
            }
        }
    }
}