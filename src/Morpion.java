import java.util.Arrays;
import java.util.Scanner;

public class Morpion {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String GREEN = "\033[0;32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String  YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";

    String[][] tableau = new String[3][3];

    // Constructeur
    Morpion() {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[0].length; j++) {
                tableau[i][j] = " ";
            }
        }
    }

    // AFFICHAGE
    public void getbeautTab() {
        System.out.println(" ___________");
        System.out.println("| " + tableau[0][0] + " | " + tableau[0][1] + " | " + tableau[0][2] + " |");
        System.out.println("|___|___|___|");
        System.out.println("| " + tableau[1][0] + " | " + tableau[1][1] + " | " + tableau[1][2] + " |");
        System.out.println("|___|___|___|");
        System.out.println("| " + tableau[2][0] + " | " + tableau[2][1] + " | " + tableau[2][2] + " |");
        System.out.println("|___|___|___|");
    }

    public void getrPositionMarked() {
        System.out.println("                                     ___________");
        System.out.println("                                    | 7 | 8 | 9 |");
        System.out.println("                                    |___|___|___|");
        System.out.println("                                    | 4 | 5 | 6 |");
        System.out.println("                                    |___|___|___|");
        System.out.println("                                    | 1 | 2 | 3 |");
        System.out.println(BLUE + " Voici le positionement a suivre " + ANSI_RESET + "-> |___|___|___|");
        System.out.println("\n\n\n\n\n");
    }

    // Methode Lunch Loop
    public static void getTabAndPlayerPos(Morpion m, Player p, Scanner sc, int[] tabPlacementActuel){
        for (int i = 0; i < 50; ++i) System.out.println();
        m.getrPositionMarked();
        m.getbeautTab();
        if (p.getId() == 0){
            System.out.println(GREEN + p.getName() +" :" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED +p.getName()+ " :" + ANSI_RESET);
        }
        verificationInput(sc,tabPlacementActuel,m ,p);
    }

    public static void verificationInput(Scanner sc,int[] tabPlacementActuel,Morpion m, Player p){
        while (true){
            try {
                String posStr = sc.nextLine();
                int pos = Integer.parseInt(posStr);
                System.out.println(Arrays.toString(tabPlacementActuel));
                if (pos > 0 || pos < 10){
                    if (tabPlacementActuel[pos-1] == pos){
                        System.out.println("Position deja joué ! ");
                    } else if (tabPlacementActuel[pos-1] != pos) {
                        tabPlacementActuel[pos-1] = pos;
                        m.setTableau(Position.traductionPosition(pos), p);
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Veuillez saisir un chiffre");
            }
        }
    }

    public static String[] write2dTo1d(Morpion m){
        String[] tabEnArray = new String[9];
        int cptp1 = 0;
            for (int i = 0; i < m.tableau.length; i++) {
            for (int j = 0; j < m.tableau[0].length; j++) {
                tabEnArray[cptp1] = m.tableau[i][j];
                cptp1++;
            }
        }
        return tabEnArray;
    }

    public static void analyseParty(String[] tabEnArrayChar,Player p,Morpion m){
        if (p.getId() == 0){
            if ( Combinaison.examinerGrille(tabEnArrayChar) == 1) {
                System.out.println( YELLOW + "                           "+p.getName() +" à gagné ! "+ ANSI_RESET);
                m.getbeautTab();
                System.exit(0);
            }
        } else if (p.getId() == 1) {
            if ( Combinaison.examinerGrille(tabEnArrayChar) == 0) {
                System.out.println( YELLOW + "                           "+p.getName() +" à gagné ! "+ ANSI_RESET);
                m.getbeautTab();
                System.exit(0);
            }
        }
    }

    public void setTableau(int[] tab, Player id) {
            int x = tab[0];
            int y = tab[1];
        if (id.getId() == 0) {
            this.tableau[x][y] = "X";
        } else {
            this.tableau[x][y] = "O";
        }
    }
}
