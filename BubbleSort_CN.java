import java.util.Scanner;

public class BubbleSort_CN {

  public static void bubbleSort(int ary[]) {
    int length = ary.length - 1;
    for (int i = length; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (ary[j] > ary[j + 1]) {
          int temp = ary[j];
          ary[j] = ary[j + 1];
          ary[j + 1] = temp;
        }
      }
    }

    for (int i : ary) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter size: ");
    int size = scn.nextInt();
    int ary[] = new int[size];
    // System.out.println("Enter data in ascending order");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }

    bubbleSort(ary);

    scn.close();
  }
}
