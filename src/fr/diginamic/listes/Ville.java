package fr.diginamic.listes;

public class Ville {
    private String nom;
    private int nbHab;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHab() {
        return nbHab;
    }

    public void setNbHab(int nbHab) {
        this.nbHab = nbHab;
    }

    public Ville(String nom, int nbHab) {
        this.nom = nom;
        this.nbHab = nbHab;
    }

    /**
     * Tri sur le nom
     * @param autre the object to be compared.
     * @return
     */
    //    @Override public int compareTo(Ville autre) {
//        return this.nom.compareTo(autre.getNom());
//    }

    /**
     * tri sur le nombre d'habitants
     * @param //autre the object to be compared.
     * @return
     */

    @Override
    public String toString() {
        return "\nVille{" + "nom='" + nom + '\'' + ", nbHab=" + nbHab + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ville)) { // on
            return false;
        }
        Ville autre = (Ville)obj;
        return this.nom.equals(((Ville) obj).getNom())&&this.nbHab==autre.getNbHab();
    }



}


