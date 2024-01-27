import java.util.Scanner;

public class PrefixSum_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Capacity: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];

    System.out.println("Enter data in array :");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    int result[] = new int[ary.length];

    // -------------------MAIN CODE ----------------
    for (int i = 0; i < ary.length; i++) {
      if (i == 0) {
        result[0] = ary[0];
      } else {
        result[i]= result[i-1] + ary[i];
      }
    }
    // -------------------MAIN CODE ----------------

    for (int i : result) {
        System.out.print(i +" ");
    }
    scn.close();
  }
}
