package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {


    public static void main(String[] args) {
        ArrayList<Integer> tabInt = new ArrayList<>();
        tabInt.add(-1);
        tabInt.add(5);
        tabInt.add(7);
        tabInt.add(3);
        tabInt.add(-2);
        tabInt.add(4);
        tabInt.add(8);
        tabInt.add(5);


        //affichage du tableau
        for (Integer integer : tabInt) {
            System.out.println(integer);
        }
        //affichage de la taille de la list
        System.out.println("taille de la liste = " +tabInt.size());

        //Recherchez et affichez le plus grand élément de la liste
        System.out.println("Le plus grand élément de la liste est " + Collections.max(tabInt));

        //Supprimez le plus petit élément de la liste et affichez le résultat

        Integer min = Collections.min(tabInt);
        //récupération de l'index de cet élément puis suppression
        int index  = tabInt.indexOf(min);
        tabInt.remove(tabInt.get(index));

        // Affichage suite suppression
        System.out.println("Affichage suite suppression");
        for(Integer integer : tabInt){
            System.out.println(integer);
        }

        //recherche des éléments positifs
        for (int i = 0; i <tabInt.size() ; i++) {
            if(tabInt.get(i)<0){
                tabInt.set(i,Math.abs(tabInt.get(i)));
            }
        }
        System.out.println("Affichage suite modifications");

        for(Integer integer : tabInt){
            System.out.println(integer);
        }
    }
}
