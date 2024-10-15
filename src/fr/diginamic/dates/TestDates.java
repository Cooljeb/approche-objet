package fr.diginamic.dates;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {

        Date date = new Date();
        Date date2 = new Date(124,9,14);

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMM/yyyy "); // format de date souhaité
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MMMM/yyyy HH':'mm':'ss "); // format de date souhaité

        System.out.println(date);
        System.out.println(date2);
        System.out.println(formateur.format(date));
        System.out.println(formateur2.format(date));
    }





}
