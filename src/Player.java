import java.util.Scanner;

public class Player {
    private String name ;
    private int score;
    private int id;

    Player(int id){
        Scanner sc = new Scanner(System.in);
        this.id = id;
        if (id == 0 ){
            System.out.println("Joueur 1 saisissez votre nom : ");
            this.name = sc.nextLine();
        } else {
            System.out.println("Joueur 2 saisissez votre nom : ");
            this.name = sc.nextLine();
        }
        this.score = 0;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
