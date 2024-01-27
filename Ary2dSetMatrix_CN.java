import java.util.Scanner;

public class Ary2dSetMatrix_CN {

  public static void main(String[] args) {

    // 3 3 
    // 1 2 3
    // 4 0 5 
    // 6 7 8 
    // ---output--
    // 1 0 3 
    // 0 0 0 
    // 6 0 8 

    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int m = scn.nextInt();

    int ary[][] = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ary[i][j] = scn.nextInt();
      }
    }

    boolean[] rows = new boolean[n];
    boolean[] cols = new boolean[m];

    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < cols.length; j++) {
        if (ary[i][j] == 0) {
          rows[i] = true;
          cols[j] = true;
        }
      }
    }

    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < cols.length; j++) {
        if (rows[i] || cols[j]) {
          ary[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < rows.length; i++) {
      for (int j = 0; j < cols.length; j++) {
        System.out.print(ary[i][j] +" ");
      }
      System.out.println();
    }

    scn.close();
  }
}
