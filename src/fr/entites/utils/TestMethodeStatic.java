package fr.entites.utils;

public class TestMethodeStatic {
    public static void main(String[] args) {

        String chaine = "12";
        int convertionInt = Integer.parseInt(chaine);
        int a = 50, b=convertionInt;
        System.out.println(Integer.max(a,b));
    }
}
