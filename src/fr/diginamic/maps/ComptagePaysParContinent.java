package fr.diginamic.maps;

import fr.diginamic.listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Pays par continent
 */

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> listePays = new ArrayList<>();//ArrayList contenant des Pays

        //Remplissage manuel de l'ArrayList
        Collections.addAll(listePays,
                new Pays("France", "65 millions d’habitants","Europe"),
                new Pays("Allemagne", "80 millions d’habitants","Europe"),
                new Pays("Belgique", "10 millions d’habitants","Europe"),
                new Pays("Russie", "150 millions d’habitants","Asie"),
                new Pays("Chine", "1.4 milliars d’habitants","Asie"),
                new Pays("Indonésie", "220 millions d’habitants","Océanie"),
                new Pays("Australie", "20 millions d’habitants","Océanie"));

        //Map stockant le nombre de pays par continent
        HashMap<String, Integer>comptagePays = new HashMap<>();

        // Bouvle de lecture
        for (int i = 0; i <listePays.size() ; i++) {
            String continent =listePays.get(i).getContinent();
            int nbPays=0;
            int j=0;// compteur de lecture de pays
            while( j < listePays.size()){
                if(listePays.get(j).getContinent().equals(continent)) {
                    nbPays++;
                    j++;
                }else {
                    j++;
                }
            }
            comptagePays.put(continent,nbPays);
            j=0;
        }
        //System.out.println(listePays);
        System.out.println("\nNombre de pays par continent");
        System.out.println(comptagePays);
    }
}
