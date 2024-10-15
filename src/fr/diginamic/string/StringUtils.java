package fr.diginamic.string;

import java.util.Arrays;

public class StringUtils {

    public static String premiereLettreMaj(String nom) {
        return nom.substring(0,1).toUpperCase()+nom.substring(1);
    }

    public static String append (Object... objects){
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            b.append(objects);
        }
        return b.toString();
    }
}
