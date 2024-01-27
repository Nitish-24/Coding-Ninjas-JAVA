import java.util.Scanner;

public class ArrRotation_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Capacity: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];

    System.out.println("Enter data in array :");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }

    System.out.println("Enter 1 for right rotation & 0 for left rotation");
    int direction = scn.nextInt();

    System.out.println(" Enter no. of rotations required: ");
    int rotation = scn.nextInt();

    int length = ary.length;
    int ary2[] = new int[length];

    if (direction == 1) {
      // Right
      for (int i = 0; i < ary2.length; i++) {
        ary2[(i + rotation) % length] = ary[i];
      }
    } else {
      // LEFT
      for (int i = 0; i < ary2.length; i++) {
        ary2[(i - rotation + length) % length] = ary[i];
      }
    }
    for (int i : ary2) {
      System.out.print(i + " ");
    }
    scn.close();
  }
}
