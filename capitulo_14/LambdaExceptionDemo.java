import java.io.*;

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

class LambdaExceptionDemo {
    public static void main(String[] args) {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };

        // Esta lambda de bloco pode lançar uma IOException
        // logo, a IOException deve ser especifida em uma cláusula
        // throws de  ioAction() em MyIOAction.
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();
            return true;
        };
    }
}