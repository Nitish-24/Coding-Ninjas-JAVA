import java.util.Scanner;

public class Triangle1_CN {


    // 1
    // 22
    // 333
    // 4444

     public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
    scn.close();
  }
}
