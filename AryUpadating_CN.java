import java.util.Scanner;

public class AryUpadating_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Capacity: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];

    System.out.println("Enter data in array :");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    System.out.println("Find: ");
    int find = scn.nextInt();
    System.out.println("Value: ");
    int value = scn.nextInt();
    // -------------------------------MAIN---------------------------------
    for (int i = 0; i < ary.length; i++) {
      if (find == ary[i]) {
        ary[i] = value;
      }
    }
    for (int i : ary) {
        System.out.print(i+" ");
    }
    scn.close();
  }
}
