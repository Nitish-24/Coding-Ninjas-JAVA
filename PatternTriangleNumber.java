import java.util.Scanner;

//            1
//           232
//          34543
//         4567654
//        567898765

public class PatternTriangleNumber {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int i, j, a = 0;
    for (i = 1; i <= num; i++) {
      for (j = i; j < num; j++) {
        System.out.print(" ");
      }
      for (j = 1; j <= i; j++) {
        ++a;
        System.out.print(a);
      }
      a--;
      for (j = 1; j < i; j++) {
        System.out.print(a);
        a--;
      }
      System.out.println();
      a++;
    }
    scn.close();
  }
}
