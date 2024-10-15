package fr.diginamic.string;

public class TestStringBuilder {
    public static void main(String[] args) {
        int age = 15;
        String nom = "Lee";

        StringBuilder builder = new StringBuilder();
        builder.append("Bonjour M.").append(nom).append(". Vous avez ").append(age).append(" ans");
        String result = builder.toString();

        //String resultat2 = StringUtils.append("Bonjour M." nom. "Vous avez "age)
      //          .append(age).append(" ans");

        System.out.println(result);
        //System.out.println(resultat2);
    }
}
