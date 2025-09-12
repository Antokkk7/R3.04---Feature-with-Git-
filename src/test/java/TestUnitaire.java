

public class TestUnitaire {
    public static void main(String[] args) {
        int resultat1 = Add.ajout(12, 13);
        if (resultat1 == 25) {
            System.out.println("Test réussi !");
        } else {
            System.out.println("Test échoué !");
        }

        int resultat2 = Remove.retrait(14, 11);
        if (resultat2 == 3) {
            System.out.println("Test réussi !");
        } else {
            System.out.println("Test échoué !");
        }
    }
}
