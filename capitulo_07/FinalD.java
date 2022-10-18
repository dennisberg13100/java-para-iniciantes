// retorna um objeto string
class ErrorMsg {
    //Códoigo de erros
    final int OUTERR = 0;
    final int INERROR = 1;
    final int DISKERROR = 2;
    final int INDEXERROR = 3;

    String msgs[] = {
            "Output error!",
            "Input error!",
            "Disck Full",
            "Index Out-of-Bounds"
    };

    // Retorna a mesndagem do erro
    String getErrorMsg(int i) {
        if(i >= 0 && i < msgs.length)
            return msgs[i];
        else
            return "Invalid ErrorCode";
    }
}

class FinalD {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERROR));
    }
}