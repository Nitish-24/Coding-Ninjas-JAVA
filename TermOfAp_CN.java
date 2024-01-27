import java.util.Scanner;

public class TermOfAp_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int i = 1;
    while (num != 0) {
      int temp = (3 * i) + 2;
      if (temp % 4 != 0) {
        System.out.print(temp + " ");
        num--;
      }
      i++;
    }

    scn.close();
    // 5 11 14 17 23 26 29 35 38 41
  }
}
