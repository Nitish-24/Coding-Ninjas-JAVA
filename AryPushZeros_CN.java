import java.util.Scanner;

public class AryPushZeros_CN {

  public static void shift(int arr[]) {
    int arr2[] = new int[arr.length];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr2[index] = arr[i];
        index++;
      } else continue;
    }
    for (int i : arr2) {
        System.out.print(i+ " ");
    }
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
    shift(ary);
    scn.close();
  }
}
