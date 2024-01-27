import java.util.Scanner;

public class Pattern_CNPractice2 {

    // 1
    // 23
    // 456
    // 78910

      public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int count =1;

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count);
        count++;
      }
      System.out.println();
    }
    scn.close();
  }
}
