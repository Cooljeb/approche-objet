package fr.diginamic.essais;

import fr.entites.Theatre;

/**
 * Créez une instance de Theatre et appelez plusieurs fois la méthode jusqu’à obtention du message d’erreur
 * Affichez le total de clients inscrits
 * Affichez la recette totale de l’établissement

 */
public class TestTheatre {
    public static void main(String[] args) {
        Theatre t1 = new Theatre("Les Rêves",5,2,0);
        t1.inscrire(1,5);
        System.out.println(t1.getNbClientsInscrits());
        System.out.println(t1.getRecette());
        t1.inscrire(1,6);
        System.out.println(t1.getNbClientsInscrits());
        System.out.println(t1.getRecette());
        t1.inscrire(2,5);
        System.out.println(t1.getNbClientsInscrits());
    }
}
