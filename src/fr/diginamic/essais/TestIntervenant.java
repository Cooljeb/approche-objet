package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {

        Salarie s1 = new Salarie("Duval","Monique",3100);
        Pigiste p1 = new Pigiste("Duval","Dominique",30);

        System.out.println(s1.getSalaire());
        System.out.println(p1.getSalaire());
        s1.afficherDonnee();
        p1.afficherDonnee();
    }


}
