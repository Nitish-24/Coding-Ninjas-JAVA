import java.util.Scanner;

public class BinarySearch_CN {

  // Sample Input 1:
  // 7
  // 1 3 7 9 11 12 45
  // 3
  // Sample Output 1:
  // 1

  public static int binarySearch(int ary[], int target) {
    int length = ary.length;
    if (length == 0) {
      return -1;
    } else {
      int start = 0;
      int end = length - 1;
      while (end > start) {
        int mid = (start + end) / 2;
        if (ary[mid] == target) {
          return mid;
        } else if (target > ary[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter size: ");
    int size = scn.nextInt();
    int ary[] = new int[size];
    System.out.println("Enter data in ascending order");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    System.out.println("Enter the number you want to search: ");
    int target = scn.nextInt();

    int result = binarySearch(ary, target);
    System.out.println(result);
    scn.close();
  }
}
