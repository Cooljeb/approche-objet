package fr.diginamic.essais;

import fr.entites.Cercle;

/**
 * Classe de test
 */
public class TestCercle {

    public static void main(String[] args) {

        Cercle c1 = new Cercle(2.5f);
        Cercle c2 = new Cercle(3.85f);
        Cercle[] tabCercle = { c1, c2 };
        //affichage du perimètre et de la surface pour chaque cercle

        for (int i = 0; i <tabCercle.length ; i++) {
            System.out.println("\naffichage du perimètre et de la surface pour c" +(i+1));
            tabCercle[i].perimetre();
            tabCercle[i].surface();
        }
    }
}
