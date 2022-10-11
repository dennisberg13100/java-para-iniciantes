/*
    Este progrma calcula quantas polegadas
    há em uma milha cubica.
 */

class CubiMileInInche {
    public static void main(String args[]) {
        long ci, im;

        im = 5280 * 12; // converte milhas em polegadas

        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in a cubic mile.");
    }
}