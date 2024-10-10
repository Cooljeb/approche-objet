package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestVille {

    public static void main(String[] args) {
            ArrayList <Ville> listeVilles = new ArrayList<>();
            Collections.addAll(listeVilles,
                new Ville("Nice", 343000),
                new Ville ("Carcassonne", 478000),
                new Ville("Narbonne", 53400),
                new Ville ("Lyon", 484000),
                new Ville ("Foix", 9700),
                new Ville ("Pau", 77200),
                new Ville ("Marseille", 850700),
                new Ville ("Tarbes", 40600));

//        Ville villeMin = new Ville("",0);
//        Ville villeMax = new Ville("",0);
//
//        for(Ville ville : listeVilles){
//            if(ville.getNbHab() < villeMin.getNbHab()){
//                villeMin= ville;
//            }
//        }
//        for(Ville ville : listeVilles){
//            if(ville.getNbHab() > villeMax.getNbHab()){
//                villeMax= ville;
//            }
//        }
        /**
         * tri effecté sur le nom de la ville
         */
        //Collections.sort(listeVilles);
        //System.out.print(listeVilles.toString());
        /**
         * tri effectué sur le nombre d'habitants
         */
        System.out.println("Affichage tri par Habitants");
        ArrayList <Ville> listeVilles2 = new ArrayList<Ville>();
        Collections.sort(listeVilles,new ComparatorHabitant(listeVilles));


        for (int i = 0; i < listeVilles.size() ; i++) {
            System.out.print(new ArrayList<Ville>().addAll(i,listeVilles));
        }
//        System.out.println("Affichage tri par Nom");
//        System.out.print("\n-----------------------");
//
//        listeVilles.sort(new ComparatorNom(listeVilles));
//        for (int i = 0; i < listeVilles.size() ; i++) {
//            System.out.print(listeVilles.toString());
//        }

    }
}
