import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        year = SafeInput.getRangeInt(testScan, "Enter your birth year within range 1950, 2015: ",1975,2015);
        month = SafeInput.getRangeInt(testScan, "Enter your birth month within range 1, 12: ",1,12);
        day = SafeInput.getRangeInt(testScan, "Enter your birth day within range 1, 31: ",1,31);
        System.out.println("Your birthdate is: " + month + "/" + day + "/" + year);
    }
}
