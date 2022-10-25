// Relanç auma exceção
class ReThrow {
    public static void main(String[] args) {
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {
            System.out.println(numer[i] + "/" + denom[i] + " is " + numer[i] / denom[i]);
        } catch (ArithmeticException exc) {
            System.out.println("Can't devide by zero!");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
            throw exc;
        }
    }
}