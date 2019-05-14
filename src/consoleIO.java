import java.util.Scanner;

public class consoleIO {
    public static void main(String[] args) {
        System.out.println("Please enter a whole number.");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        System.out.println(inputNumber);

    }
}
