import java.util.Scanner;

public class PatternPractice5_CN {

  //    1
  //   123
  //  12345
  // 1234567

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int temp = num;
    int count =1;

    for (int i = 1; i <= num; i++) {
        count =1;
      for (int j = temp; j > i; j--) {
        //  for space
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print(count);
        count++;
      }
      System.out.println();
    }
    scn.close();
  }
}
