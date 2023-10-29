import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        pattern(testScan, "Enter title");
    }

    public static void pattern(Scanner pipe, String prompt) {
        System.out.println("Enter your title: ");
        String text = pipe.nextLine();
        int stringSize = text.length();

        for (int c = 1; c <= 60; c++) {
            System.out.print("*");
        }
        System.out.println();

        int center = (54 - stringSize) / 2;

        for (int x = 1; x <= 3; x++) {
            System.out.print("*");
        }
        for(int x = 1; x < center; x++) {
            System.out.print(" ");
        }
        System.out.print(text);
        for(int x = 1; x <= center + 1; x++){
            System.out.print(" ");
        }
        for(int x = 1; x <= 3; x++) {
            System.out.print("*");
        }
        System.out.println();
        for(int x = 1; x <= 60; x++) {
            System.out.print("*");
        }
    }
}