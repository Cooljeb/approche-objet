package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> villes = new ArrayList<String>();
        String maxlettre = "";
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");


        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).length()>maxlettre.length()) {
                maxlettre =villes.get(i);
            }
        }
        System.out.println("La ville ayant le plus grand nombre de lettres est "+maxlettre);

        // ou villes.replaceAll(String::toUpperCase);
        System.out.println("Voici le tableau des villes en majuscule");
        villes.replaceAll(String::toUpperCase);
        for (int i = 0; i < villes.size() ; i++) {
            System.out.println(villes.get(i));

        }



    }
}
