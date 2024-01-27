import java.util.Scanner;
// 3
// 1 
// 1 1 
// 1 2 1 

public class PascelTrianglePattern_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num =scn.nextInt();
        for (int line = 1; line <= num; line++) {
            for (int j = 0; j <= num - line; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
 
            
            int C = 1;
            for (int i = 1; i <= line; i++) {
 
           
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();

        }

        scn.close();
    }
}
