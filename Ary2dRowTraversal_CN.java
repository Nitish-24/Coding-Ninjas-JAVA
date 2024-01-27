import java.util.Scanner;

public class Ary2dRowTraversal_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int ary[][] = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < ary[0].length; j++) {
        ary[i][j] = scn.nextInt();
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(ary[i][j] + " ");
      }
    //   System.out.println();
    }
    // System.out.println(ary[2][2]);
    scn.close();
  }
}
