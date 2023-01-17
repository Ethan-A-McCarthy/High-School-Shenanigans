/*Ethan McCarthy
Final Assessment
Comp Sci 120
6/12/2022 */

import java.io.*;//import Stream reader
class BKGame{//main class

    boolean crown = false;//global variables  that need to be initialized for later
    boolean sprite = false;
    public static void main(String[] args) throws InterruptedException, IOException{//main class
        BKGame game;//creates a new instance of game (not sure if i need this)
        game = new BKGame();

        Player greg;//creates a new player 
        greg = new Player();
        

        game.Setup();//run method setup
        game.PlayerSetup();//run method player setup
    }
    
    void Setup(){//sets up the game
        /*Outputs text intro to the game */
        System.out.println("Burger King Adventure");
        System.out.println();

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("It's been a long and tiring day and you are starving...");

        System.out.println("You say out loud: 'I could really use a whopper right now.' ");

        System.out.println("Now you start walking to Burger King...");

        System.out.println("---------------------------------------------");
    }

    void PlayerSetup() throws IOException{//player setup method
        InputStreamReader inStream = new InputStreamReader(System.in);//I/O stuff
        BufferedReader stdin = new BufferedReader(inStream);
        String nameIn;

        System.out.println("What is your character's name?");//names your character
        nameIn = stdin.readLine();

        Player fella = new Player();//makes a new player and makes the name whatever is input
        fella.setName(nameIn);

        System.out.println(fella.getName() + "'s Stats:");//outputs the stats
        System.out.println("Attack: " + fella.getATK());
        System.out.println("Health: " + fella.getHP());

        Start();//starts the game
    }

    public void Start() throws IOException{//start method
        InputStreamReader inStream = new InputStreamReader(System.in);//I/O stuff
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;
       
        //makes new rooms 
        Room Start = new Room("Street", "You are on a street filled with fast food chains, but ahead is the magical Burger King...");
        Room intersection = new Room("intersection", "An intersection lies ahead. To the left a sidewalk. To the right, a McDonalds. Ahead, the entrance to the coveted Burger King");

        //does the room method "Arrive"
        Start.Arrive();
        System.out.println("What would you like to do?");
        System.out.println("1: Go Forward");

        inData = stdin.readLine(); //user inputs their choice

        if (inData.equals("1")){//if they input 1 they move on but if they input anything else it restarts 
            intersection.Arrive();
            Intersection();//runs new method 
        }
        else {
            Start();
        }
    }

    public void Intersection() throws IOException{//new method for new place
        InputStreamReader inStream = new InputStreamReader(System.in);//I/O stuff
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;

        Player fella = new Player();//creates a new player

        //new rooms that will be used depending on user inputs
        Room Left = new Room("Sidewalk", "A sidewalk with some footprints. Maybe something lies ahead?");
        Room Right = new Room("Dons", "An old McDonalds with nobody in there.");
        Room Forward = new Room("Burger King Doors", "The entrance to the Burger King.");

        System.out.println("What would you like to do?");//gives user choice to do whats next
        System.out.println("1: Go Left");
        System.out.println("2: Go Right");
        System.out.println("3: Go Forward");

        inData = stdin.readLine();//user input

        //logic for different choices 
        switch (inData){
            case "1":
            Left.Arrive();//does room method
            Sidewalk();//runs sidewalk method
            break;

            case "2":
            Right.Arrive();//does  room method 
            Dons();//runs dons method
            break;

            case "3":
            Forward.Arrive();//does room method
            BKDoors();//e=mc^2 runs bk method 
            break;
        }
    }

    public void Sidewalk() throws IOException{ //new method sidewalk
        InputStreamReader inStream = new InputStreamReader(System.in);//i/o stuff
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;

        //new room
        Room intersection = new Room("intersection", "An intersection lies ahead. To the left a sidewalk. To the right, a McDonalds. Ahead, the entrance to the coveted Burger King");

        //new enemy 
        Enemy TheKing = new Enemy("The Burger King");
        TheKing.setHP(15);

        //new player
        Player fella = new Player();
        fella.setHP(10);

        //setup
        System.out.println("You run into The Burger King!");
        System.out.println("The crown he is wearing could be used to open the doors!");
        System.out.println("But to get the crown you have to kill him...");

        //if you have the sprite you do more damage
        if (sprite != false){
            fella.setATK(6);
        }

        else{
            fella.setATK(1);
        }

        //combat loop
        while(TheKing.getHP() > 0 | fella.getHP() > 0){//while you or the king has more than 0 hp
            System.out.println("Your HP: " + fella.getHP());
            System.out.println("The King's HP: " + TheKing.getHP());//outputs the hp of both people
            
            System.out.println("What will you do?");//choices
            System.out.println("1: Attack");
            System.out.println("2: Run");
            inData = stdin.readLine();

            if(inData.equals("2")){//you cant run away 
                System.out.println("As you go to run away The Burger King Swipes at you, knocking you to the ground.");
                System.out.println("You realize there is no backing down now.");
            }
            else{
                System.out.println("You swing at The King with all your might!");//attack
                TheKing.setHP(TheKing.getHP() - fella.getATK());//deal damage to king
            }
            
            System.out.println("The King hits you for " + TheKing.getATK() + " damage!");//king hits you
            fella.setHP(fella.getHP() - TheKing.getATK());//deals damage to you


            if (fella.getHP() < 1){
                break;
            }
            
        }

        if (TheKing.getHP() < 1){//bwurger king death 
            System.out.println("The Burger King dies!");
            System.out.println("You take the crown off of his head. This looks like we could open the Burger King doors with this.");
            crown = true;//sets crown to true, key needed to open the doors

            fella.setHP(10);

            intersection.Arrive();
            Intersection();//goes back to intersection
        }

        else if (fella.getHP() < 1){// game over 
            System.out.println("You died!");
            System.out.println("You never got your Whopper either :( ");
            System.exit(0);//exits the game
        }
    }

    public void Dons() throws IOException{//dons place
        InputStreamReader inStream = new InputStreamReader(System.in);//io stuff
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;

        //new room
        Room intersection = new Room("intersection", "An intersection lies ahead. To the left a sidewalk. To the right, a McDonalds. Ahead, the entrance to the coveted Burger King");

        //text for mcdonalds 
        System.out.println("As you step into the old McDonalds you see a glowing McDonalds sprite.");
        System.out.println("But nobody is here who could have left it here?");
        System.out.println("You decide to pick it up anyways as it could come in handy.");
        System.out.println("(ATK +5)");
        sprite = true;// you now get the sprite thats gives you more atk in the fight

        System.out.println("What would you like to do?");//user goes back to intersection
        System.out.println("1: Go Back");

        inData = stdin.readLine();

        if (inData.equals("1")){
            intersection.Arrive();
            Intersection();//back to intersection
        }
       
        else{
            Dons();//if 1 is not input, restart the method
        }
    }


    public void BKDoors() throws IOException{//burger king doors
        InputStreamReader inStream = new InputStreamReader(System.in);//io stuff
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;

        //new room
        Room intersection = new Room("intersection", "An intersection lies ahead. To the left a sidewalk. To the right, a McDonalds. Ahead, the entrance to the coveted Burger King");

        //tells the user that doors are closed
        System.out.println("As you walk towards the doors, you see they are closed shut.");
        System.out.println("There is a crown shaped hole in the door though. Maybe its for a key?");

        System.out.println("What will you do next?");//choices
        System.out.println("1: Inspect keyhole");
        System.out.println("2: Go back");

        inData = stdin.readLine();

        if(inData.equals("1")){//inspect the keyhole
            if(crown != false){//if you have the crown
                System.out.println("You put the crown in the hole and the doors open.");
                BurgerKing(); //gets you inside Burger king
            }
            else {
                //if no crown it hints at the player to go kill the king
                System.out.println("The doors are tightly sealed but there was a guy wearing a crown down the street.");
                System.out.println("Maybe that could be the key?");
                BKDoors();//restarts doors method
            }
        }

        else{//if input isnt 1 or 2 restarts the method
            intersection.Arrive();
            Intersection();
        }

    }


    public void BurgerKing(){
        //end of game text 
        System.out.println("You walk in and see a Whopper sitting on the counter, as if it was waiting for you.");
        System.out.println("You take a bite.");
        System.out.println("It's the best Whopper ever.");
        System.out.println("The End.");
    }

}




class Player{//player constructor class
    //initiaizes variables 
    private String Name;
    private int HP;
    private int maxHP = 10;
    private int ATK;

    public Player(){//player object
        HP = maxHP;
        ATK = 1;
    }

    //getters and setters
    public int getHP(){
        return HP;
    }

    public void setHP(int hp){
        HP = hp;
    }

    public int getATK(){
        return ATK;
    }

    public void setATK(int atk){
        ATK = atk;
    }

    public String getName(){
        return Name;
    }

    public void setName(String name){
        Name = name;
    }

    public boolean isAlive(){
        return HP > 0;
    }

    
}

class Enemy{//enemy class
    //variables
    private String Name;
    private int HP = 15;
    private int ATK = 3;

    public Enemy(String name){//enemy object
        name = Name;
    }

    //getters and setters 
    public int getHP(){
        return HP;
    }

    public void setHP(int hp){
        HP = hp;
    }

    public int getATK(){
        return ATK;
    }

    public String getName(){
        return Name;
    }
}

class Room {//room class 
    //variables 
    private String RoomName;
    private String RoomDescription;

    public Room(String aRoomName, String aRoomDescription){///room object
        RoomName = aRoomName;
        RoomDescription = aRoomDescription;
    }

    //getters and setters
    public String getRoomName(){
        return RoomName;
    }

    public String getRoomDescription(){
        return RoomDescription;
    }

    void Arrive(){//arrive method to show the player the description of the room
        System.out.println(RoomDescription);
    }

}