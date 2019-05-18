package util;

public class InputTest {
    public static void main(String[] args) {
        Input sc = new Input();
        sc.getString();
        sc.yesNo();
        sc.getInt(1, 10);
        sc.getInt();
        sc.getDouble(1, 10);
        sc.getDouble();
        sc.getString(true);

    }
}
