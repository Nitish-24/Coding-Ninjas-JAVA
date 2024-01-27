import java.util.Scanner;

// 1 2 3 4
//  2 3 4
//   3 4
//    4
//   3 4
//  2 3 4
// 1 2 3 4

public class PatterHourglass_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int i, j, k;

    // for loop for printing
    // upper half
    for (i = 1; i <= num; i++) {
      // printing  spaces
      for (k = 1; k < i; k++) System.out.print(" ");

      // printing i to rows
      for (j = i; j <= num; j++) System.out.print(j + " ");

      System.out.println();
    }

    // for loop for printing lower half
    for (i = num - 1; i >= 1; i--) {
      // printing i spaces
      for (k = 1; k < i; k++) System.out.print(" ");

      // printing i to rows value

      for (j = i; j <= num; j++) System.out.print(j + " "); 

      System.out.println();
    }
    scn.close();
  }
}
