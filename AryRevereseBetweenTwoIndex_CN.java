import java.util.Scanner;

public class AryRevereseBetweenTwoIndex_CN {

  public static int[] swap(int arr[], int start, int end) {
    // int size = end -start;

    while (end > start) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      end--;
      start++;
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Capacity: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];
    System.out.println("Start");
    int start = scn.nextInt();

    System.out.println("End: ");
    int end = scn.nextInt();

    System.out.println("Enter data in array :");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }

    int arr[] = swap(ary, start, end);
    for (int i : arr) {
      System.out.print(i + " ");
    }
    scn.close();
  }
}
