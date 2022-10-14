// Usa XOR para codifivar e decodificar uma mensagem.

class EncodeString {
    public static void main(String[] args) {
        String msg = "Este texto é altamente confidencial.";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgh";
        int j;

        System.out.println("Mensagem original: ");
        System.out.println(msg + "\n");

        // codifica a mensagem
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }


        System.out.println("Mensagem codificada:");
        System.out.println(encmsg + "\n");

        // decodifica a mensagem;
        j = 0;
        for (int i = 0; i < encmsg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }

        System.out.println("Mensagem decodificada:");
        System.out.println(decmsg);
    }
}