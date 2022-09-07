public class FootballPlayer {

    public int no;
    public String name;
    public boolean inPlay;
    public int minutes= 0;
    public int numberOfGoals;

    void play(int minutesToPlay){

     minutes += minutesToPlay;

    }

    void score(int score){
     numberOfGoals += score;


    }

}
