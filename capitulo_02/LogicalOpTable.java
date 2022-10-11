// Uma tabela-verdade para os operadores lògicos

class LogicalOpTable {
    public static void main(String args[]) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = q = true;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));

        p = q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
    }
}