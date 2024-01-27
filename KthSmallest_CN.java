import java.util.Scanner;

public class KthSmallest_CN {

  public static int bubbleSort(int ary[], int k) {
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

    return ary[k - 1];
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
    System.out.println("Enter K: ");
    int k = scn.nextInt();

    int result = bubbleSort(ary, k);
    System.out.println(result);

    scn.close();
  }
}
