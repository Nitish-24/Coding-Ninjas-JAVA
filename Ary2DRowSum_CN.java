import java.util.Scanner;

public class Ary2DRowSum_CN {

    // 2 5 
    // 4 5 3 2 6 
    // 7 5 3 8 9

    // 20 32


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    // int max2 = (n > m ? n : m);
    int ary[][] = new int[n][m];
    // int sumAry[] = new int[max2];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ary[i][j] = scn.nextInt();
      }
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = 0;
      for (int j = 0; j < m; j++) {
        sum += ary[i][j];
      }
      System.out.print(sum + " ");
    }
    scn.close();
  }
}
