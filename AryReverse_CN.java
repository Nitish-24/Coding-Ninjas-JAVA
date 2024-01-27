import java.util.Scanner;

public class AryReverse_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Capacity: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];

    System.out.println("Enter data in array :");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    int start = 0;
    int last = ary.length - 1;
    for (int i = 0; i < capacity / 2; i++) {
      // if (start != last) {
      int temp = ary[start];
      // System.out.println(ary[start] +" start");
      ary[start] = ary[last];
      // System.out.println(ary[start] + " start");
      // System.out.println(ary[start] + " last");
      ary[last] = temp;
      // System.out.println(ary[start] + " start");

      start++;
      last--;
    }
    // if (start == last) {
    //   break;
    // }

    for (int i : ary) {
      System.out.print(i + " ");
    }
    scn.close();
  }
}
