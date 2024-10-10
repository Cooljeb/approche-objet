package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {

    public ComparatorNom(ArrayList<Ville> listeVilles) {
    }
    @Override public int compare(Ville courante, Ville autre) {
        return courante.getNom().compareTo(autre.getNom());
    }

}
