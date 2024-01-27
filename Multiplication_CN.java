import java.util.Scanner;

public class Multiplication_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for(int i =1 ; i<=10 ;i++){
            System.out.println(num*i);
        }
        scn.close();
    }
}
