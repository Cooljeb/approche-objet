package fr.entites;

/**
 * Classe Cercle
 */
public class Cercle {

    private float rayon;

    private final float RCARRE ;
    private final float PI = 3.14f;
    private final float DIAMETRE ;

    //Constructeur et initalisation de la valeur des variables
    public Cercle (float rayon) {
        this.rayon=  rayon;
        RCARRE = rayon*rayon;
         DIAMETRE = rayon*2;
    }
    // Accesseurs

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    /**
     * Méthode qui affiche le résulat du calcul du périmètre d'un cercle pour un rayon donné
     *
     */
    public void surface(){
        System.out.println("La surface du cercle est :" +RCARRE*PI );
    }

    /**
     * Méthode qui affiche le résulat du calcul de la surface d'un cercle
     * on affecte la valeur de r saisi à la variable rayon, pour permetre d'alimenter la constante DIAMETRE
     */
    public void perimetre(){
        System.out.println("Le périmètre du cercle  est: " +DIAMETRE*PI );
    }


}
