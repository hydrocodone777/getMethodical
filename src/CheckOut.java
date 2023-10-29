import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner testScan = new Scanner(System.in);
        boolean loop = true;
        double next = 0;
        double sum = 0;
        do{
            next = SafeInput.getRangeDouble(testScan,"Enter next item price", .50,10);
            sum = sum + next;
            loop = SafeInput.getYNConfirm(testScan, "Do you have more items?");
        }
        while(loop);
        System.out.println("Your total is " + sum);
    }

}
