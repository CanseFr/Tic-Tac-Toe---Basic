public class Position {

    public static int[] traductionPosition(int p){
        int x = 0 ;
        int y = 0 ;
        if ( p == 7 ) {x = 0;y = 0;}
        if (p == 8 ) {x = 0;y = 1;}
        if (p == 9 ) {x = 0;y = 2;}
        if (p == 4 ) {x = 1;y = 0;}
        if (p == 5 ) {x = 1;y = 1;}
        if (p == 6 ) {x = 1;y = 2;}
        if (p == 1 ) {x = 2;y = 0;}
        if (p == 2 ) {x = 2;y = 1;}
        if (p == 3 ) {x = 2;y = 2;}
        return new int[]{x,y};
    }

}

