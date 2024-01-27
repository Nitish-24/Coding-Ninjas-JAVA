import java.util.Scanner;

public class FahernheitToCelcius_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int start = scn.nextInt();
        int end = scn.nextInt();
        int step = scn.nextInt();
        for(int i = start; i <=end;){

            double ans = (i-32)/(1.8);
            System.out.println( i +" "+ (int)ans);
            i = i+step;
        }

        scn.close();
    }
}
