package fr.diginamic.operations;

public class Operations {

    //variables
    private double a;
    private double b;

    //Constructeur
    public Operations(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //accesseurs

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public  void calcul (double a, double b, char c) {
        switch (c){

            case '+':
                System.out.println(a+" + "+b+" ="+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" ="+(a-b));
                break;
            case '/':
                System.out.println(a+" / "+b+" ="+(a/b));
                break;
            case '*':
                System.out.println(a+" x "+b+" ="+(a*b));
                break;
        }

    }
}
