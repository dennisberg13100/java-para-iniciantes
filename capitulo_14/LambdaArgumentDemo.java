interface StringFunc {
    String func(String str);
}

class LambdaArgumentDemo {
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda Exporessions Expand Java.";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // Define uma expressão lambda que inverte o conteúdo de um
        // string e a atribui a ume variável de referênciaStringFunc.
        StringFunc reverse = (str) -> {
            String result = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        // passa reversa como argumento de changeStr()
        // passa o string de entrada como o segundo argumento
        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        // Esta expressão lambda substitui espaços por hifens.
        // Ela está imbutida diretamente na chamada a changeStr().
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with string replace: " + outStr);

        // Esta lambda de bloco inverte a caixa dos caracteres do string
        // Ela também está imbutida diretamente na chamada a changeStr().
        outStr = changeStr((str) -> {
            String result = " ";
            char ch;

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);
        System.out.println("The string in reversed case: " + outStr);
    }
}

