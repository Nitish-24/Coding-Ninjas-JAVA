import java.util.Scanner;

public class InsertingTrianglePatternAlpha_CN {

  // E
  // DE
  // CDE
  // BCDE
  // ABCDE

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    // int charr = 'A'+ num-1;
    int startPoint = 'A' + num - 1;
    for (int i = 1; i <= num; i++) {
      startPoint = 'A' + num - i;
      for (int j = 1; j <= i; j++) {
        System.out.print((char) startPoint);
        startPoint++;
      }
      System.out.println();
    }
    scn.close();
  }
}
