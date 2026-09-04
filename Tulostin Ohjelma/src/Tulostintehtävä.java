public class Tulostintehtävä {
    public static void main(String[] args) throws Exception {
        double luku1 = 25;
        double luku2 = 15;
        double luku3 = 7; 
        
        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.println("-------------------------");

        String tekija = "Ohjelman tekijä: Matias";
        System.out.println(tekija);
        System.out.println("        ");

        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);

        double summa = luku1 - luku2;
        System.out.println ("Lukujen yhteenlaskettu summa on " + summa);
        System.out.println("     ");

        System.out.println("Jatketaan laskentaa lisäämällä muuttuja luku3 = 7 ja miinustetaan se ylläolevasta summasta");
 
        double jatko = summa - luku3;
        System.out.println(" = " +jatko);

    }
}
