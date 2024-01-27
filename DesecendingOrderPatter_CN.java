import java.util.Scanner;

public class DesecendingOrderPatter_CN {

  // 5
  // 5 4
  // 5 4 3
  // 5 4 3 2
  // 5 4 3 2 1

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    for (int i = 1; i <= num; i++) {
      int temp = num;
      for (int j = 1; j <= i; j++) {
        System.out.print(temp+" ");
        temp--;
      }
      System.out.println();
    }
    scn.close();
  }
}
