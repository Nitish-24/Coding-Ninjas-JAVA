import java.util.Scanner;

public class SquareRootIntegral {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for(int i = 1; i<=num ;i++){
            if (i*i > num) {
                System.out.println(i-1);
                break;
            }
            if (i*i==num) {
                System.out.println(i);
                break;
            }
        }
        scn.close();
    }
}
