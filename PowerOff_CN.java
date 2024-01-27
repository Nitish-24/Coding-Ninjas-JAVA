import java.util.Scanner;

public class PowerOff_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int product = 1;
    if (a == 0 && b == 0) {
      System.out.print(1);
    } else if (a == 0 && b == 1) {
      System.out.print("0");
    } else {
      for (int i = 1; i <= b; i++) {
        product *= a;
      }
      System.out.println(product);
    }
    scn.close();
  }
}
