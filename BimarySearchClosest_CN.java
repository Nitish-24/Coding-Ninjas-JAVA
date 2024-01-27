import java.util.Scanner;

public class BimarySearchClosest_CN {

  //     7
  // 6 7 11 13 21 44 46
  // 22
  // Sample Output 2:
  // 4

  public static int binarySearchClosest(int ary[], int target) {
    int left = 0;
    int right = ary.length - 1;
    int mid = (left + right) / 2;
    // int leftelement = mid - 1;
    // int rightelement = mid + 1;

    while (right > left + 1) {
      mid = (left + right) / 2;
      if (ary[mid] == target) {
        return mid;
      } else if (target > ary[mid]) {
        left = mid;
      } else {
        right = mid;
      }
    }
    if (ary[right] - target < target - ary[left]) {
      return right;
    } else return left;
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

    int result = binarySearchClosest(ary, target);
    System.out.println(result);
    scn.close();
  }
}
