import java.util.Scanner;

public class DownwardTrianglePattern_CN {

  // ***
  //  **
  //   *

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int count = num;

    for (int i = 1; i <= num; i++) {
      // for space
      for (int zero = 1; zero < i; zero++) {
        System.out.print(" ");
      }
    //   System.out.println();
    //   for star
        for (int j = count; j != 0; j--) {
          System.out.print("*");
        }
        System.out.println();
        count--;
    }
    scn.close();
  }
}
