import java.util.Scanner;

public class NprMethod_CN {

    public static void npr(int N ,int R) {

    int result= fact(N)/ fact(N-R);
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

        npr(N,R);
        scn.close();

    }
    
}
