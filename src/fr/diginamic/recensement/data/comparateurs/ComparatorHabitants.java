package fr.diginamic.recensement.data.comparateurs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparatorHabitants implements Comparator {

    Map mesClassementparhab;

    public ComparatorHabitants(HashMap<String,Integer> mesRégionsparhab) {

        this.mesClassementparhab=mesRégionsparhab;

    }

    @Override public int compare(Object actuel, Object autre) {
        if ((Integer)mesClassementparhab.get(actuel) >(Integer) mesClassementparhab.get(autre)) {
            return -1;
        } else {
            return 1;
        }
    }


}
