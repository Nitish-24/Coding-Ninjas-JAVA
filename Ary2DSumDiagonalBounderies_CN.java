import java.util.Scanner;

public class Ary2DSumDiagonalBounderies_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    // int max2 = (n > m ? n : m);
    int arr[][] = new int[n][n];
    // int sumAry[] = new int[max2];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    int requiredSum = 0;
    int N = arr.length;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i == j || (i + j) == N - 1) {
          requiredSum += arr[i][j];
        } else if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
          requiredSum += arr[i][j];
        }
      }
    }

    System.out.println(requiredSum);
    scn.close();
  }
}
