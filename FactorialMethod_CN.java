import java.util.Scanner;

public class FactorialMethod_CN {

public static void factorial(int num) {
int result =1;
    for(int i =1 ; i<=num ;i++){
        result*=i;
    }
    System.out.println(result);
}


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num  = scn.nextInt();
        factorial(num);
        scn.close();
    }
}
