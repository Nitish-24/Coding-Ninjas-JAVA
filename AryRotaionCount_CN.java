import java.util.Scanner;

public class AryRotaionCount_CN {

  public static int rotateCount(int a[]) {
    int n = a.length;
    int start = 0;
    int end = n - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (mid > 0 && a[mid] < a[mid - 1]) {
        return mid;
      }

      if (mid < n - 1 && a[mid] > a[mid + 1]) {
        return mid + 1;
      }

      if (a[start] <= a[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Capacity: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];

    System.out.println("Enter data in array :");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }

    int count = rotateCount(ary);
    System.out.println(count);
    scn.close();
  }
}
