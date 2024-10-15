package fr.diginamic.maison;

import java.util.Arrays;
import java.util.Objects;

/**
 * La classe Maison va représenter une maison avec un unique attribut : un tableau d’objets de type Piece.
 *
 * cette classe possède une méthode ajouterPiece(Piece piece) qui permet d’ajouter une pièce à la maison.
 *
 * cette classe possède une méthode qui retourne la superficie totale de la maison
 *
 * cette classe a une méthode qui retourne la superficie d’un étage donné.
 */
public class Maison {
    Piece [] tabPiece = new Piece[0];

    /**
     * Permettre l'ajout d'une pièce
     * celle-ci doit être non nulle sinon on affiche un message d'erreur
     * un contrôle est fait sur la saisie de la superficie et de l'étage
     * la superficie ne peut pas être nulle
     * la saisie de l'étage ne peut être inférieure à -2
     * -1 => pour un sous-sol
     * -2 => Bunker / cave
     * @param p
     */
    public  void ajouterPiece(Piece p) {
        if (Objects.isNull(p)) {
            System.out.println("❌❌ ajout de la pièce impossible !");
        }else if (p.getEtage()<0||p.getEtage()<-2){
            System.out.println("❌❌ Saisie Etage incorrecte !");
        }else if(p.getSuperficie()<0){
            System.out.println("❌❌ Saisie de la superficie incorrecte !");
        }else{
            tabPiece = Arrays.copyOf(tabPiece,tabPiece.length+1); // création nouveau tableau de taille +1
            tabPiece[tabPiece.length-1] = p; // ajout de pièce dans le tableau
        }
    }

    /**
     * Fonction sans paraètre d'entrée retournant la superficie totale de la maison
     * @return superficie
     */
    public double superficieMax(){
        double superficie=0.0d; // variable de méthode stockant la superficie de toute la maison
        for (int i = 0; i <tabPiece.length; i++) {
            superficie+=tabPiece[i].getSuperficie();
        }
        return superficie;
    }

    public double superficieEtage(int e){
        double superficie=0.0d; // variable de méthode stockant la superficie de l'étage donné

        for (int i = 0; i < tabPiece.length ; i++) {
            if(tabPiece[i].getEtage() == e){
                superficie+=tabPiece[i].getSuperficie();
            }
        }
        return superficie;
    }

    /**
     * méthode qui prend en paramètre un type de pièce donné et retourne la superficie globale
     * pour ce type de pièce donné : par exemple, la superficie globale des chambres.
     * @param p Pèce à analyser
     * variable superficie
     *
     * @return
     */
     public double superficiePiece(Piece p) {
        double superficie=0.0d;
        String typePiece = p.getClass().getSimpleName();
         for (int i = 0; i <tabPiece.length ; i++) {
             if (typePiece.equals(tabPiece[i].getClass().getSimpleName())){
                 superficie+=tabPiece[i].getSuperficie();
             }
         }
        return superficie;
     }

    /**
     * Dans la classe Maison, écrivez une méthode qui retourne le nombre de pièces d’un type donné
     * : par exemple le nombre de chambres.
     * @param p Pèce à compter
     * @return nbpiece Nombre de pièce
     */
     public int nbPieceType(Piece p){
         int nbpiece=0;
         String typePiece = p.getClass().getSimpleName();
         for (int i = 0; i <tabPiece.length ; i++) {
             if (typePiece.equals(tabPiece[i].getClass().getSimpleName())){
                 nbpiece++;
             }
         }
       return nbpiece;
     }


}
