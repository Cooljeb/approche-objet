package fr.entites;

import fr.entites.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        Personne p1 = new Personne();
        Personne p2= new Personne();

        p1.prenom="Josianne";
        p1.nom="Martin";
        p1.adresse.numeroRue=1;
        p1.adresse.libelleRue="rue de la paix";
        p1.adresse.codePostal=75000;
        p1.adresse.Ville="Paris";

        p2.prenom="Jean-Louis";
        p2.nom="David";
        p2.adresse.numeroRue=1;
        p2.adresse.libelleRue="cours des tifs";
        p2.adresse.codePostal=44230;
        p2.adresse.Ville="Saint Sébastien sur Loire";

    }
}
