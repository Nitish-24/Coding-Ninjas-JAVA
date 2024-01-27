import java.util.Scanner;

public class LoanEligibility_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        double salary = scn.nextDouble();
        boolean loantaken = scn.nextBoolean();

        if (age>=18 && salary > 2000 && loantaken ==false) {
            System.out.println("You are eligible for the loan.");
            
        }
        else
        System.out.println("You are not eligible for the loan.");
        scn.close();
    }
}
