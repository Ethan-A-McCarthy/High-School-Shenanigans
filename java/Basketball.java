/*Ethan McCarthy with help from Majd, Logan and Lucy
Assignment J8
4/22/2022
Comp Sci 120*/
class Player {
    String playerName;
    String playerNum;
    String playerTeam;

    Player(String pNameIn, String pNumIn, String pTeamIn){//players constructor 
        playerName = pNameIn;
        playerNum = pNumIn;
        playerTeam = pTeamIn;
    }

    void dribble(){//dribble method
        System.out.println(playerName + " on " + playerTeam + " dribbles the ball up the court.");
    }
    void shoot(){//shoot method
        System.out.println(playerName + " on " + playerTeam + " takes a shot!");
    }
}

class Basketball{
    public static void main(String[] args) {//main class
        
        Player Ethan = new Player("Ethan", "29", "The Chads");//constructing the players
        Player Majd = new Player("Majd", "69", "The Chads");
        Player Alex = new Player("Alex", "7", "The Alphas");
        Player Lucy = new Player("Lucy", "10", "The Alphas");

        Ethan.dribble();//calling on the dribble and shoot method
        Majd.dribble();
        Alex.dribble();
        Lucy.dribble();
        Ethan.shoot();
        Majd.shoot();
        Alex.shoot();
        Lucy.shoot();
    }
}