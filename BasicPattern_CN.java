import java.util.Scanner;

public class BasicPattern_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
    scn.close();
  }
}
