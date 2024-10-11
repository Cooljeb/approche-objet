package fr.diginamic.maps;

import fr.diginamic.listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * créez une map permettant de stocker les instances de villes (valeur) en fonction de leur nom (clé).
 * Recherchez et supprimez la ville qui a le moins d’habitants
 * Affichez l’ensemble des villes restantes.
 */
public class MapVilles {

    public static void main(String[] args) {
        //déclaration des villes

        ArrayList<Ville> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles,
                new Ville("Nice", 343000),
                new Ville ("Carcassonne", 478000),
                new Ville("Narbonne", 53400),
                new Ville ("Lyon", 484000),
                new Ville ("Foix", 9700),
                new Ville ("Pau", 77200),
                new Ville ("Marseille", 850700),
                new Ville ("Tarbes", 40600));

        //map

        HashMap<String, Integer> mesVilles = new HashMap<>();

        for (Ville listeVille : listeVilles) {
            mesVilles.put(listeVille.getNom(), listeVille.getNbHab());
        }
        //Affichage de la MAP initialisée
        System.out.println(mesVilles);

         int mini = Integer.MAX_VALUE;
         String cleASuppr="";
        for(String key1 : mesVilles.keySet()){
            // Test sur le nombre d'habitants
            if (mesVilles.get(key1)<mini){
                cleASuppr = key1;

            }
        }
        //suppression de la ville dont la clé est contenue dans mini
        mesVilles.remove(cleASuppr);
        System.out.println(mesVilles);
    }

}
