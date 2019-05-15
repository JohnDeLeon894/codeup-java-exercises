import java.util.*;


public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letGrade ="";
        System.out.println("Please enter a grade from 0 to 100.");
        int grade = Integer.parseInt(sc.next());
        if (grade<101){
            letGrade = "A";
        }
        if (grade<88){
            letGrade = "B";
        }
        if(grade< 80){
            letGrade = "C";
        }
        if (grade<67){
            letGrade = "D";
        }
        if (grade<60){
            letGrade = "F";
        }

        System.out.println(letGrade);
    }
}
