import java.util.Arrays;

public class Combinaison {


    public static int examinerGrille(String[] tabEnArray){

        // PLAYER 1 -> 1 -> X
        // Horizontal -> h1 h2 h3
            if (tabEnArray[0].equals("X")  && tabEnArray[1].equals("X")  && tabEnArray[2].equals("X")
                || tabEnArray[3].equals("X")  && tabEnArray[4].equals("X")  && tabEnArray[5].equals("X")
                || tabEnArray[6].equals("X")  && tabEnArray[7].equals("X")  && tabEnArray[8].equals("X") ){
            return 1;
        }
        // Vertical -> v1 v2 v3
            else if (tabEnArray[0].equals("X")  && tabEnArray[3].equals("X")  && tabEnArray[6].equals("X")
                    || tabEnArray[1].equals("X")  && tabEnArray[4].equals("X")  && tabEnArray[7].equals("X")
                    || tabEnArray[2].equals("X")  && tabEnArray[5].equals("X")  && tabEnArray[8].equals("X") ){
            return 1;
        }
        // Diagonal -> dhg hhd
            else if (tabEnArray[0].equals("X")  && tabEnArray[4].equals("X")  && tabEnArray[8].equals("X")
                    || tabEnArray[2].equals("X")  && tabEnArray[4].equals("X")  && tabEnArray[6].equals("X") ) {
                return 1;


        // PLAYER 2 -> 0 -> O
        // Horizontal -> h1 h2 h3
        }else if (tabEnArray[0].equals("O")  && tabEnArray[1].equals("O")  && tabEnArray[2].equals("O")
                    || tabEnArray[3].equals("O")  && tabEnArray[4].equals("O")  && tabEnArray[5].equals("O")
                    || tabEnArray[6].equals("O")  && tabEnArray[7].equals("O")  && tabEnArray[8].equals("O") ){
            return 0;
        }
        // Vertical -> v1 v2 v3
        else if (tabEnArray[0].equals("O")  && tabEnArray[3].equals("O")  && tabEnArray[6].equals("O")
                    || tabEnArray[1].equals("O")  && tabEnArray[4].equals("O")  && tabEnArray[7].equals("O")
                    || tabEnArray[2].equals("O")  && tabEnArray[5].equals("O")  && tabEnArray[8].equals("O")   ){
            return 0;
        }
        // Diagonal -> dhg + hhd
        else if (tabEnArray[0].equals("O")  && tabEnArray[4].equals("O")  && tabEnArray[8].equals("O")
                    || tabEnArray[2].equals("O")  && tabEnArray[4].equals("O")  && tabEnArray[6].equals("O") ){
            return 0;
        }
        return -1;
    }


}
