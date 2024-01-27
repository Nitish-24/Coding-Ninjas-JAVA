import java.util.Scanner;

public class AryInsertion_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Capacity: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];

    System.out.println("Size: ");
    int size = scn.nextInt();

    System.out.println("Enter data in array :");
    for (int i = 0; i < size; i++) {
      ary[i] = scn.nextInt();
    }
    // -------------------------------MAIN---------------------------------
    System.out.println("Enter index:");
    int index = scn.nextInt();

    System.out.println("Enter value: ");
    int value = scn.nextInt();

    for (int i = size; i >= index; i--) {
      if (capacity != 0) {
        ary[i + 1] = ary[i];
      }
      if (i == index) {
        ary[i] = value;
        break;
      }
    }

    for (int i : ary) {
      System.out.print(i + " ");
    }
    scn.close();
  }
}
