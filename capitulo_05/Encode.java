// Usa XOR para codifivar e decodificar uma mensagem.

class Encode {
    public static void main(String[] args) {
        String msg = "Este texto é altamente confidencial.";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.println("Mensagem original: ");
        System.out.println(msg + "\n");

        // codifica a mensagem
        for (int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.println("Mensagem codificada:");
        System.out.println(encmsg + "\n");

        // decodifica a mensagem;
        for (int i = 0; i < encmsg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.println("Mensagem decodificada:");
        System.out.println(decmsg);
    }
}