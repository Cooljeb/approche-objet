package fr.diginamic.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FusionMap {
    public static void main(String args[]) {
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
        // Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        //Création map3

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();

        for(int key1 : map1.keySet()){
            map3.put(key1,map1.get(key1));
        }
        for(int key2 : map2.keySet()){
            map3.put(key2,map2.get(key2));
        }

        System.out.println(map3);




    }
}
