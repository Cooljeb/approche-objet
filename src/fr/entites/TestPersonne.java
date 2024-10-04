package fr.entites;

import fr.entites.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        Personne p1 = new Personne ("Josianne","Martin",
                new AdressePostale(12,"rue des acacias",44120,"Vertou"));
        Personne p2= new Personne("Jean-Louis","David",
                new AdressePostale(1,"cours des tifs",44230,"Saint Sébastien sur Loire"));



    }
}
