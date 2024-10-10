package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {

    public static void main(String[] args) {

        //création de la map

        Employes e1 =new Employes("Paul",1750);
        Employes e2 =new Employes("Hicham",1825);
        Employes e3 =new Employes("Yu",2250);
        Employes e4 =new Employes("Ingrid",2015);
        Employes e5 =new Employes("Chantal",2418);

        HashMap<String, Float> mapSalaire = new HashMap<>();

        mapSalaire.put(e1.getPrenom(), e1.getSalaire());
        mapSalaire.put(e2.getPrenom(), e2.getSalaire());
        mapSalaire.put(e3.getPrenom(), e3.getSalaire());
        mapSalaire.put(e4.getPrenom(), e4.getSalaire());
        mapSalaire.put(e5.getPrenom(), e5.getSalaire());

        System.out.println("Taille de la Map = "+mapSalaire.size());


    }
}
