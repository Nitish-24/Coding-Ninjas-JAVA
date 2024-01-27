import java.util.Scanner;

public class HallowenPattern_CN {



    // 4
    // 1234
    // 1  2
    // 1  2
    // 1234

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count;

        for(int i =1 ; i<=num ; i++){
            count =1;
            for(int j =1 ; j<=num ; j++){
                if (i==1 || i==num) {
                    System.out.print(count);
                    count++;
                }
               else if (j==1 || j==num) {
                    System.out.print(count);
                    count++;
                    
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
        scn.close();
    }
}
