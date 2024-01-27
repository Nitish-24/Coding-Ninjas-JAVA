import java.util.Scanner;

public class Factors_CN {

  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
        int num = scn.nextInt();
        int i;
        int flag = 0;
        if (num == 1) {
          System.out.println("1");
        } else {
          for (i = 2; i < num; i++) {
            if (num % i == 0) {
              System.out.print(i + " ");
              flag++;
            }
          }
          if (i == num && flag == 0) {
            System.out.println("-1");
          }
        }
        scn.close();
    }
  }
}
