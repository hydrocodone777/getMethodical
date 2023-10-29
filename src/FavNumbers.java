import java.util.Scanner;

public class FavNumbers {
    public static Scanner testScan = new Scanner(System.in);
    public static void main(String[] args) {
        int favInt = 0;
        double favDouble = 0;
        favInt = SafeInput.getInt(testScan,"Enter your favorite integer: ");
        System.out.println("Your favorite integer is: " + favInt);
        favDouble = SafeInput.getDouble(testScan, "Emter your favorite double");
        System.out.println("Your favorite double is: " + favDouble);
    }
}
