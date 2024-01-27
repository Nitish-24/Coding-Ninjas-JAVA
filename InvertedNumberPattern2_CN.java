import java.util.Scanner;

public class InvertedNumberPattern2_CN {

  // 4444
  // 333
  // 22
  // 1

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    // int startPoint = num;
    for (int i = num; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      for (int k = num; k > i; k--) {
        System.out.print(" ");
      }
      System.out.println();
    }
    scn.close();
  }
}
