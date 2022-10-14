// Usa uma string para controlar uma instrução switch

class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Conecting...");
                break;
            case "cancel":
                System.out.println("Canceling...");
                break;
            case "disconect":
                System.out.println("Disconecting...");
                break;
            default:
                System.out.println("Command Error!");
                break;
        }
    }
}