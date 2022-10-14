// Exibe todas as informações de linha de comando

class CLDemo {
    public static void main(String[] args) {
        System.out.println("There are " + args.length + " command-line arguments.");

        int index = 0;
        System.out.println("They are:");
        for (String arg : args)
            System.out.println("arg[" + (index++) + "]: " + arg);
    }
}