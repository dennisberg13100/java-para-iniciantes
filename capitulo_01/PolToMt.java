/*
    Este programa cria uma tabela de conversão
    de polegadas em metros
 */

class PolToMt {
    public static void main(String args[]) {
        int pes, pol;
        double metros;

        metros = 0.0254;

        for (pes = 0; pes < 12; pes++){
            for (pol = 1; pol < 12; pol++){
                System.out.println(pes + "\"" + pol + "' = " + metros + "m");
                metros += 0.0254;
            }
            System.out.println();
        }
    }
}