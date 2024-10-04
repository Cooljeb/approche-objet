package fr.entites;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale a1 = new AdressePostale();
        AdressePostale a2 = new AdressePostale();

        a1.numeroRue=12;
        a1.libelleRue="rue des acacias";
        a1.codePostal=44120;
        a1.Ville="Vertou";

        a2.numeroRue=13;
        a2.libelleRue="Boulevard parmesan";
        a2.codePostal=44000;
        a2.Ville="Nantes";
    }
}
