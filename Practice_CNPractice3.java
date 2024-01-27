import java.util.Scanner;

public class Practice_CNPractice3 {

  // 1
  // 23
  // 345
  // 4567

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int count = 1;

    for (int i = 1; i <= num; i++) {
        count =i;
      for (int j = 1; j <= i; j++) {
        System.out.print(count);
        count++;
      }
      System.out.println();
     
    }
    scn.close();
  }
}
