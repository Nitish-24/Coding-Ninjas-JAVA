import java.util.Scanner;

public class PositiveNegative_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if (num>0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        scn.close();
    }
}
