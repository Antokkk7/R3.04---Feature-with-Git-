package src.test.java;

import src.main.java.Add;

public class TestUnitaire {
    public static void main(String[] args) {
        int resultat = Add.ajout(12, 13);
        if (resultat == 25) {
            System.out.println("Test réussi !");
        } else {
            System.out.println("Test échoué !");
        }
    }
}
