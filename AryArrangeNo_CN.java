import java.util.Scanner;

public class AryArrangeNo_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Capacity: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];

    // --------------------MAIN------------------------

    int start = 0;
    int end = capacity - 1;

    for (int i = 0; i < ary.length; i++) {
      if (i % 2 == 0) {
        ary[start] = i+1;
        start++;
      } else {
        ary[end] = i+1;
        end--;
      }
    }
    // --------------------MAIN------------------------

    for (int i : ary) {
      System.out.print(i + " ");
    }
    scn.close();
  }
}
