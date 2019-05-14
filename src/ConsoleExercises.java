 import java.util.Scanner;
public class ConsoleExercises {
	public static void main(String[] args) {
    // double pi = 3.14159;
    // System.out.printf("%.2f %n", pi);
    // Scanner threeWordScanner = new Scanner(System.in);
    // System.out.println("Type 3 words.");
    // String userInput1 = threeWordScanner.next();
    // String userInput2 = threeWordScanner.next();
    // String userInput3 = threeWordScanner.next();
    // System.out.printf("%s %s %s %n", userInput1,userInput2,userInput3);
    // Scanner sentenceInput = new Scanner(System.in);
    // System.out.println("Please enter a sentence.");
    // String userSentence= sentenceInput.nextLine();
    // System.out.printf(userSentence + "%n");
        int roomWidth;
        int roomLength;
        Scanner roomLengthandWidth =new Scanner(System.in);


        System.out.println("Please enter a value for the room length and Width");
        float inputLength = Float.parseFloat(roomLengthandWidth.next());
        float inputWidth = Float.parseFloat(roomLengthandWidth.next());
        System.out.printf("%s^2 + %s^2 = %s%n", inputLength, inputWidth,
        (Math.pow(inputLength, 2) + Math.pow(inputWidth,2)));


	}
}
