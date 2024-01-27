import java.util.Scanner;

public class DiamondStarPattern_CN {

  //      *
  //     ***
  //    *****
  //     ***
  //      *

  public static void main(String[] args) {
    int row, i, j, space, decider;
    Scanner s = new Scanner(System.in);

    // System.out.print("Enter the Row Size: ");
    row = s.nextInt();

    decider = row / 2;

    for (i = 0; i < row; i++) {
      if (i <= decider) {
        for (space = i; space < decider; space++) System.out.print(" ");
        for (j = 0; j < (i * 2) + 1; j++) System.out.print("*");
        System.out.print("\n");
      } else {
        for (space = i; space > decider; space--) System.out.print(" ");
        for (j = (row * 2) - 1; j > (i * 2); j--) System.out.print("*");
        System.out.print("\n");
      }
    }
  }
}
