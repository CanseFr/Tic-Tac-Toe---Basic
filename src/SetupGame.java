import java.io.IOException;
import java.util.Scanner;

public class SetupGame {
    public void luncheGame(Scanner sc, Morpion m, Player p1, Player p2, int[] tabPlacementActuel) throws IOException {
        String[] tabEnArray = new String[9];

        // PLAYER 1 -> 1 -> X
        Morpion.getTabAndPlayerPos(m,p1,sc,tabPlacementActuel);

        // Grille to Array p1
        tabEnArray = Morpion.write2dTo1d(m);

        // Analyse G&P
        Morpion.analyseParty(tabEnArray,p1,m);


        // PLAYER 2 -> 0 -> O
        Morpion.getTabAndPlayerPos(m,p2,sc,tabPlacementActuel);

        // Grille to Array p2
        tabEnArray = Morpion.write2dTo1d(m);

        // Analyse G&P
        Morpion.analyseParty(tabEnArray,p2,m);
    }
}