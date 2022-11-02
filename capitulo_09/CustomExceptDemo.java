// Usa uma exceção personalizada.

// cria uma exceção
class NonIntResultException extends Exception {
    int n, d;

    NonIntResultException(int n , int d) {
        this.n = n;
        this.d = d;
    }

    public String toString() {
        return "Result of " + n + "/" + d + " is not an integer!";
    }
}

class CustomExceptDemo {
    public static void main(String[] args) {
        // AQui numer tem alguns valores impares
        int numer[] = { 4,8,15,32,64,127,256,512};
        int denom[] = {2,0,4,4,0,8};

        for (int i = 0; i < numer.length; i++) {
            try {
                if((numer[i] % 2) != 0)
                    throw new
                            NonIntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + "/" + denom[i] + " is " + numer[i]/denom[i]);
            } catch (ArithmeticException exc) {
                System.out.println(exc);
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println(exc);
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}