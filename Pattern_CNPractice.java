import java.util.Scanner;

public class Pattern_CNPractice {

// 4
// 1
// 12
// 123
// 1234
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    for (int n = 1; n <= num; n++) {
      for (int m = 1; m <= n; m++) {
        System.out.print(m);
      }
      System.out.println();
    }
    scn.close();
  }
}
