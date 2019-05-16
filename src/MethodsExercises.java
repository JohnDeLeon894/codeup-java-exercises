import java.util.Scanner;
import java.util.concurrent.*;

public class MethodsExercises {
    static int sum;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int ranX = (int)(Math.random()*100);
        int ranY = (int)(Math.random()*100);
        methAdd(ranX, ranY);
        ranX = (int)(Math.random()*100);
        ranY = (int)(Math.random()*100);
        methSub(ranX, ranY);
        ranX = (int)(Math.random()*100);
        ranY = (int)(Math.random()*100);
        methMult(ranX, ranY);
        methMultRec(ranX,ranY);
        ranX = (int)(Math.random()*100);
        ranY = (int)(Math.random()*100);
        methDiv(ranX, ranY);
        methDiv(10,0);
        getInteger(1,10);
    }
    public static void methAdd(int x, int y){
        System.out.printf("%s + %s is equal to ",x,y);
        System.out.println(x+y);
    }
    public static void  methSub(int x, int y){
        System.out.printf("%s - %s is equal to ",x,y);
        System.out.println(x-y);
    }
    public static void  methMult(int x, int y){
        System.out.printf("%s x %s is equal to ",x,y);
        System.out.println(x*y);
    }
    public static void  methDiv(int x, int y){
        if(y==0){
            System.out.printf("%s / %s is equal to ",x,y);
            System.out.println("0 r 0");
            return;
        }
        System.out.printf("%s / %s is equal to ",x,y);
        System.out.println((x/y) + " r " + x%y );
    }
    public static void methMultRec(int x,int y){


        if(y<=0){
            System.out.printf("Recursive method results = %s%n" ,sum);
            return;
        }
        sum += x;
        y--;
        methMultRec(x, y);
    }
    public static int getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = input.nextInt();
        if (userNumber>= min && userNumber<= max) {
            getInteger(min, max);
            return userNumber;
        }
        for (int i = 0;i<= userNumber; i++){
            System.out.printf("%s ",Integer.toBinaryString(i));
            if(i%10==0) {
                System.out.printf("%n");
            }
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nnumber was not valid...");
        return userNumber;
    }

}
