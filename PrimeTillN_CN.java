import java.util.Scanner;

public class PrimeTillN_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = scn.nextInt();
    // int flag = 0;
if (num > 2) {
    // System.out.println("1");
    System.out.println("2");
}
    for (int j = 1; j <= num; j++) {
      for (int i = 2; i < j; i++) {
        if (j % i == 0) {
          break;
        }
        if (i == (j - 1)) {
          System.out.println(j);
        }
      }
    }

    scn.close();
  }
}
