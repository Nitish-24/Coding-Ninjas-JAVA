import java.util.Scanner;

public class NcrMethod_CN {


public static void ncr(int N ,int R) {

    int result= fact(N)/(fact(R) * fact(N-R));
    System.out.println(result);
    
}
public static int fact (int N ) {

    int result =1;
    for(int i =1 ; i<=N ;i++){
        result*=i;
    }
    return result;

    
}


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int R = scn.nextInt();

        ncr(N,R);
        scn.close();

    }
}
