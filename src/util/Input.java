package util;
import java.util.Scanner;


/*
    Create an input validation class

    Create directory inside of src named util. Inside of util, create a class named Input that has a
    private property named scanner. When an instance of this object is created, the scanner property
    should be set to a new instance of the Scanner class. The class should have the following
    methods, all of which return command line input from the user:

    String getString()
    boolean yesNo()
    int getInt(int min, int max)
    int getInt()
    double getDouble(double min, double max)
    double getDouble()
    The yesNo method should return true if the user enters y, yes, or variants thereof, and false
    otherwise.

    The getInt(int min, int max) method should keep prompting the user for input until they give an
    integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.

    Create another class named InputTest that has a static main method that uses all of the methods from the Input class.

    Bonus

    Allow all of your methods for getting input to accept an optional string parameter named prompt.
    If passed, the method should show the given prompt to the user before parsing the input.
 */
public class Input {

    private Scanner scanner;

    public Input(){
        System.out.println("System waiting for user input");
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please input a string.");
        String input = this.scanner.nextLine();
        System.out.println(input);
        return input;
    }
    public boolean yesNo(){
        System.out.println("Please input an affirmation");
        String input = this.scanner.nextLine();

        input = input.toLowerCase();
        if(input.contains("yes")||input.contains("yeah")||input.contains("ok")||input.contains("sure")||
                input.contains("why not")||input.contains("for sure")||input.contains("im " +
                "down")||input.contains("definitely")||input.contains("absolutely")||
                input.contains("indeed")||input.contains("of course")|| input.contains("y")){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
    public int getInt(int min, int max){
//        The getInt(int min, int max) method should keep prompting the user for input until they give an
//        integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
        System.out.printf("Please input a number between %s and %s \n", min, max);
        int input = this.scanner.nextInt();
        boolean valid = false;
        if(input < min || input > max){
            System.out.println("Input is not a valid input");
            return 0;
        }
        System.out.printf("Selected valid number = %s\n", input);
        return input;
    }
    public int getInt(){
        System.out.println("Please enter any Integer");
        int input = this.scanner.nextInt();
        return input;
    }
    public double getDouble(double min, double max){
        System.out.printf("Please input a number between %s and %s \n", min, max);
        double input = this.scanner.nextDouble();
        if(input < min || input > max){
            System.out.println("Input is not a valid input");
            return 0;
        }

        System.out.printf("Selected floating point number = %s\n", input);
        return input;
    }
    public double getDouble(){
        System.out.println("Please enter any floating point number:");
        double input = this.scanner.nextDouble();
        System.out.printf("Selected number = %s\n", input);
        return input;
    }

    // methods with optional prompt info
    public String getString(boolean prompt){
        System.out.println("Please input a string.");
        String input = this.scanner.nextLine();
        System.out.printf("User input = \"%s\"\n", input);
        System.out.println(input);
        return input;
    }
    public boolean yesNo(boolean prompt){
        System.out.println("Please input an affirmation");
        String input = this.scanner.nextLine();
        System.out.printf("User input = %s", input);

        input = input.toLowerCase();
        if(input.contains("yes")||input.contains("yeah")||input.contains("ok")||input.contains("sure")||
                input.contains("why not")||input.contains("for sure")||input.contains("im " +
                "down")||input.contains("definitely")||input.contains("absolutely")||
                input.contains("indeed")||input.contains("of course")|| input.contains("y")){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
    public int getInt(int min, int max, boolean prompt){
//        The getInt(int min, int max) method should keep prompting the user for input until they give an
//        integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
        System.out.printf("Please input a number between %s and %s \n", min, max);
        int input = this.scanner.nextInt();
        System.out.printf("User input = %s", input);
        if(input < min || input > max){
            System.out.println("Input is not a valid input");
            return 0;
        }
        System.out.printf("Selected number = %s\n", input);
        return input;
    }
    public int getInt(boolean prompt){
        System.out.println("Please enter any Integer");
        int input = this.scanner.nextInt();
        System.out.printf("User input = %s", input);
        return input;
    }
    public double getDouble(double min, double max, boolean prompt ){
        System.out.printf("Please input a number between %s and %s \n", min, max);
        double input = this.scanner.nextDouble();
        System.out.printf("User input = %s", input);
        if(input < min || input > max){
            System.out.println("Input is not a valid input");
            return 0;
        }

        System.out.printf("Selected number = %s\n", input);
        return input;
    }
    public double getDouble(boolean prompt){
        System.out.println("Please enter any floating point number:");
        double input = this.scanner.nextDouble();
        System.out.printf("User input = %s", input);
        System.out.printf("Selected number = %s\n", input);
        return input;
    }

}