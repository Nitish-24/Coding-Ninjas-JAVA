import java.util.Scanner;

public class ReversePyramidPattern_CN {

  // ****
  //  ***
  //   **
  //    *

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    for (int i = 1; i <= num; i++) {
      int star = num - i;
      //  for space
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }

      //    for star
      for (int k = 0; k <= star; k++) {
        System.out.print("* ");
      }

      System.out.println();
    }
    scn.close();
  }
}
