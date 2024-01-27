import java.util.Scanner;

public class AryTripletSum {

  public static void findTripletSum(int ary[], int value) {
    int result = 0;

    for (int i = 0; i < ary.length - 2; i++) { // for 1st element
      for (int j = i + 1; j < ary.length - 1; j++) { // for 2nd value
        for (int j2 = j + 1; j2 < ary.length; j2++) {
          if (ary[i] + ary[j] + ary[j2] == value) {
            result++;
          }
        }
      }
    }
    System.out.println(result);
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
    System.out.println("Enter value:");
    int value = scn.nextInt();

    // int result[] = new int[ary.length];

    // ========================================MAIN================================

    findTripletSum(ary, value);
    scn.close();
    // ========================================MAIN================================

  }
}
