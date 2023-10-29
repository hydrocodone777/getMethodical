import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        String firstname = "";
        String lastname = "";
        firstname = SafeInput.getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("First name is " + firstname);
        lastname = SafeInput.getNonZeroLenString(testScan, "Enter your Last name");
        System.out.println("Last name is " + lastname);
        System.out.println("Your name is " + firstname + " " + lastname );
    }
}