package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        //Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 secondes
        Calendar cal= Calendar.getInstance();// création du Calendrier avant d'extraire la date
//        cal.set(Calendar.YEAR, 2016);
//        cal.set(Calendar.MONTH, 4);
//        cal.set(Calendar.DAY_OF_MONTH, 19);
//        cal.set(Calendar.HOUR_OF_DAY, 23);
//        cal.set(Calendar.MINUTE, 59);
//        cal.set(Calendar.SECOND, 30);
        cal.set(2016,4,19,23,59,30);
        Date date = cal.getTime(); // Extraction de la date depuis le calendreir

        Locale russie = Locale.forLanguageTag("ru-RU");
        Locale allemand = Locale.forLanguageTag("de-DE");
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMM/yyyy HH':'mm':'ss ");
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MMMM/yyyy HH':'mm':'ss ",russie);
        SimpleDateFormat formateur3 = new SimpleDateFormat("dd/MMMM/yyyy HH':'mm':'ss ",Locale.CHINA);
        SimpleDateFormat formateur4 = new SimpleDateFormat("dd/MMMM/yyyy HH':'mm':'ss ",Locale.GERMANY);
        SimpleDateFormat formateur5 = new SimpleDateFormat("dd/MMMM/yyyy HH':'mm':'ss ",allemand);

        System.out.println(formateur.format(date));
        System.out.println(formateur2.format(date));
        System.out.println(formateur3.format(date));
        System.out.println(formateur4.format(date));
        System.out.println(formateur5.format(date));


        
    }
}
