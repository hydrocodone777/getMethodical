import java.util.Scanner;

public class reggie {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        String ssnRegEx = ("^\\d{3}-\\d{2}-\\d{4}$");
        String ssn = SafeInput.getRegExString(testScan, "Enter your ssn",ssnRegEx);
        String mnumRegEx = "^(M|m)\\d{5}$";
        String mnum = SafeInput.getRegExString(testScan, "Enter your MID",mnumRegEx);
        System.out.println("Your ssn is " + ssn + " Your MID is " + mnum);
    }
}
