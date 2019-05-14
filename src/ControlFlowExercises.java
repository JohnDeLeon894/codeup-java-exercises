public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        int k = 0;
        int j = 2;
        int counter = 0;
        while (i < 16) {
            if (i == 15) {
                System.out.println(i);
                break;
            }
            System.out.print(i++ + " ");
        }

        for(counter = 0;counter <3;) {
            if (counter == 0) {
                System.out.println(k++);
                if (k == 101) {
                    k = 100;
                    counter = 1;
                }
            }
            if (counter == 1) {
                System.out.println(k -= 5);
                if (k == -10) {
                    counter = 3;
                }
            }
        }

        for(j=2;j<1000000;j = (int) Math.pow(j, 2)) {
            System.out.println(j);
        }
    }
}
