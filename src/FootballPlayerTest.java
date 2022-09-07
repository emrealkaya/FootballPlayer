public class FootballPlayerTest {

    public static void main(String[] args) {

        FootballPlayer debruyne = new FootballPlayer();
        debruyne.minutes=0;
        debruyne.numberOfGoals = 0;
        debruyne.inPlay = true;
        debruyne.no = 17;
        debruyne.score(2);
        debruyne.name = "Kevin De Bruyne";
        debruyne.play(90);

        System.out.println("Footballer Name: " + debruyne.name + "\n" + "De Bruyne in Play : " +
                                 debruyne.inPlay + "\n" + "Kevin De Bruyne score: " + debruyne.numberOfGoals
                                    +"\n" + "De Bruyne's Shirt Number : " + debruyne.no);
        System.out.println("Kevin De Bruyne played totally " + debruyne.minutes + " minutes so far.");


    }
}
