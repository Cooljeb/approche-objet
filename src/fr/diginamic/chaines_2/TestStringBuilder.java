package fr.diginamic.chaines_2;

/**
 * TP – COMPRENDRE L’INTERET DE LA CLASSE STRINGBUILDER
 */
public class TestStringBuilder {
    public static void sbuilder() {
        StringBuilder temps = new StringBuilder();

        long debut = System.currentTimeMillis();
        for (int i = 1; i < 100_000; i++) {
            temps.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("StringBuilder Temps écoulé en millisecondes :" + (fin - debut));
    }

    public static void string() {
        String temps = "";

        long debut = System.currentTimeMillis();
        for (int i = 1; i < 100_000; i++) {
            temps=temps+i;
        }
        long fin = System.currentTimeMillis();
        System.out.println("String en + Temps écoulé en millisecondes :" + (fin - debut));
    }
    public static void concatString() {
        String temps = "";

        long debut = System.currentTimeMillis();
        for (int i = 1; i < 100_000; i++) {
            temps=temps.concat(""+i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("String+Concat  Temps écoulé en millisecondes :" + (fin - debut));
    }
    public static void main(String[] args) {

        sbuilder();
        string();
        concatString();

    }

}
