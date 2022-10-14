// usa substring()

class SubString {
    public static void main(String[] args) {
        String orgstr = "Java make the Web move.";

        // constrói uma substring
        String substr = orgstr.substring(5,18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}