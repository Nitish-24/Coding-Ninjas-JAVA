import java.util.Scanner;

public class ReverseNumber_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int flag = 0;
    if (num == 0) {
      System.out.print("0");
    } else {
      while (num != 0) {
        if (num % 10 != 0 || flag > 0) {
          flag++;
          System.out.print(num % 10);
          num = num / 10;
        } else num = num / 10;
      }
    }
    scn.close();
  }
}
