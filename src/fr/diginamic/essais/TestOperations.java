package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * Classe de Test des opérations
 * -,+,*,/
 */
public class TestOperations {

    public static void main(String[] args) {

        Operations op = new Operations(45.2,56.2); // Nouvelle instance d'Operations

        // Test sur les différents types de calcul

        op.calcul(op.getA(), op.getB(), '-');
        op.calcul(op.getA(), op.getB(), '+');
        op.calcul(op.getA(), op.getB(), '*');
        op.calcul(op.getA(), op.getB(), '/');
    }
}
