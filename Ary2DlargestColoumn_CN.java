import java.util.Scanner;

public class Ary2DlargestColoumn_CN {

  public static void main(String[] args) {
    // Sample Input 1:
    // 1
    // 3 2
    // 6 9
    // 8 5
    // 9 2
    // Sample Output 1:
    // column 0 23
    Scanner scn = new Scanner(System.in);

    int no = scn.nextInt();
    int mo = scn.nextInt();
    // int max2 = (n > m ? n : m);
    int ary[][] = new int[no][mo];
    // int sumAry[] = new int[max2];

    for (int i = 0; i < no; i++) {
      for (int j = 0; j < mo; j++) {
        ary[i][j] = scn.nextInt();
      }
    }

    int n = ary.length;
    
    if (n == 0) {
      System.out.println("row 0 " + Integer.MIN_VALUE);
    } else {
      int m = ary[0].length;
      int finalsum = 0;
      int sum = 0;
      int it = 0;
      String resultSting = "";
      // -----for row ----
       for (int i = 0; i < n; i++) {
        sum = 0;
        for (int j = 0; j < m; j++) {
          sum += ary[i][j];
        }
        if (finalsum < sum) {
          finalsum = sum;
          it = i;
          resultSting = "row";
        }
      }

      // ---------------for column ------------
      for (int j = 0; j < m; j++) {
        sum = 0;
        for (int i = 0; i < n; i++) {
          sum += ary[i][j];
        }
        if (finalsum < sum) {
          finalsum = sum;
          it = j;
          resultSting = "column";
        }
      }
     
      System.out.println(resultSting + " " + it + " " + finalsum);
    }
    scn.close();
  }
}
