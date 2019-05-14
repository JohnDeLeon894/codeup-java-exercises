//import java.util.Scanner;
import java.util.*;



public class theArena {
    static int playerHealth = (int)(Math.random()*20+90);
    public static void main(String[] args) {
        boolean valid = true;


        String awoken = ("All you remember when you awaken is thinking that you know you were\n" +
                "getting too drunk, but wanting to see how the night will play out. Now when\n" +
                "you " +
                "open your eyes you find yourself in a dark room with a pile of straw that\n" +
                "appears to be some sort of bed, a table with a single candle and what looks to\n" +
                "be a note. There is also a door that leads out of the room.");


        String theNote = ("Then note reads:\n Dear Stranger,\n " +
                "\t You may be wondering where you find yourself.\n " +
                "\t You may also be wondering how you got here. None\n" +
                "\t of that matters now. You are in the Arena now." +
                "\n\t Sincerely the Arena Master");

        System.out.println(awoken);
        Scanner readNote = new Scanner(System.in);
        System.out.println("what do you do?");
        String response = readNote.nextLine();
        String chkResponse = response.toLowerCase();

        while (valid) {
            if (chkResponse.contains("door") && chkResponse.contains("open")) {
                System.out.println("As you open the door you are immediately ushered into a wide room" +
                        "\nwith a pit in the middle. You are briskly tossed into the pit with a " +
                        "number" +
                        "\nof other people whom seem to be intent on beating the everliving light out" +
                        " " +
                        "\nof the eyes of any who come near.");
                fight();
                valid = false;
            } else if (chkResponse.contains("read") && chkResponse.contains("note")) {
                System.out.println(theNote);
                System.out.println("what do you do?");
                response = readNote.nextLine();
                chkResponse = response.toLowerCase();
            } else {
                System.out.println("response not understood.");
                System.out.println("what do you do?");
                response = readNote.nextLine();
                chkResponse = response.toLowerCase();
            }

        }
    }

    private static void fight() {
        System.out.println("A fighter locks his eyes on you and violently charges to you.");

            int health = (int) (Math.random() * 20 + 90);
            int attkDamage;
            int plyAttack;
            int potions = 3;
            int heal;
            Scanner theFight= new Scanner(System.in);
            String resPonse;

        while(health >0){
            attkDamage = (int)(Math.random()*20+5);
            plyAttack = (int)(Math.random()*20+10);
            System.out.printf("Your enemy attacks you with murder in his eyes for %s damage\n",
                    attkDamage);
            playerHealth -= attkDamage;
            System.out.printf("your health is %s \n", playerHealth);
            System.out.println("What do you do?");

            resPonse =(theFight.nextLine()).toLowerCase();;
            if (resPonse.contains("attack")||resPonse.contains("fight")){
                System.out.printf("You lash out at your enemy as if your life depends on it for " +
                        "%s damage" +
                        "%n" +
                        "Enemy health: %s \n", plyAttack, health-=plyAttack);
            } else if (resPonse.contains("potion")&& resPonse.contains("drink")){
                if(potions>0){
                    heal = (int)(Math.random()*20+10);
                    playerHealth+= heal;
                    System.out.printf("Your health is now %s after drinking a potion\n",
                                    playerHealth);
                    potions -=1;
                }else {
                    System.out.println("you have no more potions");
                }
            }

        }

    }
}

class enemy{

    public void main(String[] args) {

        enemy enemyFighter = new enemy() {
        int health = (int)(Math.random()*20+90);
        int attkDamage =5;

        };


    }
}

class hero{
    String name;
    int health;
    int attack;

}