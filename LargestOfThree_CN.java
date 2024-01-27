import java.util.Scanner;

public class LargestOfThree_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int result = (a>b)? (a>c)? a:c :(b>c)? b:c;
        System.out.println(result);
        scn.close();
    }
}
