import java.util.Scanner;

public class SumTillN_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int sum =0;

        for(int i =1 ; i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
        scn.close();
    }
}
