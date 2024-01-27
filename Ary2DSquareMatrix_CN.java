import java.util.Scanner;

public class Ary2DSquareMatrix_CN {

  //     Input:
  // 3 3
  // 1 2 3
  // 4 5 6
  // 7 8 9

  // Output:
  // YES
  // 1 5 9

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    if (n != m) {
      System.out.println("NO");
    } else {
      int ary[][] = new int[n][m];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          ary[i][j] = scn.nextInt();
        }
      }

      System.out.println("YES");

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (i == j) {
            System.out.print(ary[i][j]+ " ");
          }
        }
      }
    }
    scn.close();
  }
}
