package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulation {

    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        //Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux

        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        //Itérateur de clés

        System.out.println("Clés\n");
        for (int key : mapVilles.keySet()) {
            System.out.println(key);
        }
        //Itérateur de valeurs
        System.out.println("\nValeurs\n");
        for (String v : mapVilles.values()) {
            System.out.println(v);
        }

        //Taille de la map
        System.out.println("\nTaille de la Map = "+mapVilles.size());

    }

}
