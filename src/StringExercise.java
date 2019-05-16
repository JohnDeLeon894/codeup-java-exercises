import java.util.Scanner;
import java.util.ArrayList;

public class StringExercise {
    public static void main(String[] args) {

//        String[] message = {"We don't need no education\n", "We don't need no thought control\n"
//                , "Check \"this\" out!, \"s inside of \"s!\n",  "In windows, the main drive is " +
//                "usually C:\\\n", "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!"};
//        for (int i = 0; i<message.length; i++){
//            System.out.println(message[i]);
//        }
        Scanner xFactor = new Scanner(System.in);
        System.out.println("Please enter a number from 1- 10");
        int x = xFactor.nextInt();
        findFactors(x);
    }

    public static void findFactors(int x){
        /*Calculate the factorial of a number.

        Prompt the user to enter an integer from 1 to 10.
        Display the factorial of the number entered by the user.
        Ask if the user wants to continue.
        Use a for loop to calculate the factorial.
        Assume that the user will enter an integer, but verify it’s between 1 and 10.
        Use the long type to store the factorial.
        Continue only if the user agrees to.
        A factorial is a number multiplied by each of the numbers before it.
        Factorials are denoted by the exclamation point (n!). Ex:


        1! = 1               = 1
        2! = 1 x 2           = 2
        3! = 1 x 2 x 3       = 6
        4! = 1 x 2 x 3 x 4   = 24*/
        // x = the number input by user from scanner.
        long sum = 1;
        // string format for output
        String returnFormat = "%s! =%-15s = %s";
        // string format for adding factors
        String usrCont;
        String factNum="";
        // scanner for if user wants to continue
        Scanner wantContinue = new Scanner(System.in);
        // checks to see if this is the first run
        boolean firstRun = true;
        // loop to count output
        for(int i = 1; i <= x; i++){
            if(firstRun){
                factNum = " 1";
                firstRun = false;
            }else {
                factNum += (" x " + i);
            }
            sum *=i;
        }
        System.out.printf(returnFormat,x, factNum,sum);
        System.out.println("\nWould you like to run it again?");
        usrCont = wantContinue.nextLine();
        if(usrCont.contains("yes")||usrCont.contains("yeah")||usrCont.contains("ok")||usrCont.contains("sure")||
                usrCont.contains("why not")||usrCont.contains("i'm down")||usrCont.contains("im " +
                "down")||usrCont.contains("definitely")||usrCont.contains("absilutely")||
                usrCont.contains("indeed")||usrCont.contains("of course")|| usrCont.contains("y")){
            Scanner xFactor = new Scanner(System.in);
            System.out.println("Please enter a number from 1- 10");
            x = xFactor.nextInt();
            findFactors(x);
        }


    }
}
class Bob{
    public static void main(String[] args) {
        boolean bobConvo = true;
        boolean firstTime= true;
        boolean keepTalking = true;
        Scanner bobListener = new Scanner(System.in);
        String input;
        char inputProcessed;
        String[] bobResponse = {
                "Sure.",
                "Whoa, chill out!",
                "Fine. Be that way!",
                "Whatever"
        };
        while (bobConvo){
            System.out.println("Would you like to talk to Bob the lackadaisical teenager?");
            input = bobListener.nextLine().toLowerCase();
            if(input.contains("yes")||input.contains("yeah")||input.contains("ok")||input.contains("sure")||
                    input.contains("why not")||input.contains("i'm down")||input.contains("im " +
                    "down")||input.contains("definitely")||input.contains("absilutely")||
                    input.contains("indeed")||input.contains("of course")){

                while(keepTalking) {
                    if (firstTime) {
                        firstTime = false;
                        System.out.println("Bob says\"Sup\"");
                    }
                    input = bobListener.nextLine();
                    if(input.isEmpty()){inputProcessed='0';}else {
                        inputProcessed = input.charAt(input.length() - 1);
                    }
                    if (input.toLowerCase().contains("stop talking")) {
                        keepTalking=false;
                    }

                    switch (inputProcessed){
                        case '?':
                            System.out.println(bobResponse[0]);
                            break;
                        case '!':
                            System.out.println(bobResponse[1]);
                            break;
                        case '0':
                            System.out.println(bobResponse[2]);
                            break;

                        default:
                            System.out.println(bobResponse[3]);

                    }



                }
            } else{
                System.out.println(bobResponse[2]);
                bobConvo = false;
            }
        }
    }
}
/*for (int i = 1; i < x; i++){
            // loop to format output
            for(int j=1;j<=i;j++){
                sum = i*j;
                // if first time run format like this
                if (firstRun){
                    firstRun = false;
                    System.out.printf(returnFormat, j,j,j);
                }else{
                    sum = i*j;
                    factFormat = factFormat.concat()
                }


            }
        }*/