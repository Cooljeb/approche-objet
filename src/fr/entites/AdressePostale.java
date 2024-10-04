package fr.entites;

public class AdressePostale {
    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        Ville = ville;
    }

    int numeroRue;
    String libelleRue;
    int codePostal;
    String Ville;


}
