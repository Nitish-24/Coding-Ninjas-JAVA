import java.util.Scanner;

public class AryPairSum_CN {

public static void  pairSum(int ary[], int value) {
int result =0;
// 1 3 6 2 5 4 3 2 4
// 12
// 6
    for (int j = 0; j < ary.length ; j++) { // for 2nd value
        for (int j2 = j + 1; j2 < ary.length; j2++) {
          if ( ary[j] + ary[j2] == value) {
            result++;
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

    pairSum(ary,value);
    scn.close();
    // ========================================MAIN================================
}
}

