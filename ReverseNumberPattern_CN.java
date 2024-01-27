import java.util.Scanner;

public class ReverseNumberPattern_CN {

// 1
// 21
// 321
// 4321

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count =0;

        for(int i = 0; i <= num ; i++){
            count +=i;
            for(int j =1 ; j<=i ;j++){
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
        scn.close();
    }
    
}
