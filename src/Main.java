import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// relancer game -> incrementer score -> Regle de depart tirage aleatoir, et fair recommencer le gagnant de la derniere parti premier a 10 a gagné tous les matches




public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Player p1 = new Player(0);
        Player p2 = new Player(1);
        Morpion m = new Morpion();
        SetupGame s = new SetupGame();
        int[] tabPlacementActuel = new int[9];

        while (true) {
            s.luncheGame(sc,m,p1,p2,tabPlacementActuel);
        }
    }
}











