import java.util.*;


public class ControlFlowExercises {
    public static void main(String[] args) {
        int num;
        int numSqrd;
        int numCbd;
        int inputNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a whole numbe");
        inputNum = Integer.parseInt(sc.next());
//        numSqrd = (int)Math.pow(num,2);
//        numCbd = (int)Math.pow(num,3);

        String leftAlignFormat = " %-5s | %-7s |%-5s  %n";

        System.out.format("-----------------+------%n");
        System.out.format(" number| Squared | cubed   %n");
        System.out.format("-----------------+------%n");
        for (int i = 1; i <= inputNum; i++) {
            num = i;
            numSqrd = (int)Math.pow(num,2);
            numCbd = (int)Math.pow(num,3);
            System.out.format(leftAlignFormat,num, numSqrd,numCbd);
        }
        System.out.format("+-----------------+------+%n");

    }
}
