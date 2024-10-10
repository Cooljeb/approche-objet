package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

    public ComparatorHabitant(ArrayList<Ville> listeVilles) {
    }

    @Override public int compare(Ville courante, Ville autre) {

        if(courante.getNbHab()>autre.getNbHab()){
            return 1;
        }
        if(courante.getNbHab()<autre.getNbHab()){
            return -1;
        }
        return 0;
    }
}
