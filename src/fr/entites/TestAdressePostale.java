package fr.entites;

public class TestAdressePostale {
    public static void main(String[] args) {

        AdressePostale a1 = new AdressePostale(12,"rue des acacias",44120,"Vertou");
        AdressePostale a2 = new AdressePostale(13,"Boulevard parmesan",44000,"Nantes");

        System.out.println(a1);
        System.out.println(a2);
    }
}
