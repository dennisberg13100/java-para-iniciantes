// Retorn um objeto String
class Err {
    String msg;
    int severity;

    Err(String msg, int severity) {
        this.msg = msg;
        this.severity = severity;
    }
}
class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index out-of-bounds"
    };

    int howBad[] = {3, 3, 2, 4};

    // Retorna a mensagem de erro
    Err getErrInfo(int i) {
        if(i >= 0 & i < msgs.length)
            return new Err (msgs[i], howBad[i]);
        return new Err("Invalide Error Code", 0);
    }
}

class ErrorMsg {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrInfo(2);
        System.out.println(e.msg + "  - severity: " + e.severity);
        e = err.getErrInfo(19);
        System.out.println(e.msg + " - severity: " + e.severity);
    }
}