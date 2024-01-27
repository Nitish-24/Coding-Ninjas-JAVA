import java.util.Scanner;

public class InversionSelectionSort_CN {

    // Sample Input 2:
    // 7
    // 17 5 14 16 11 18 10
    // Sample Output 2:
    // 10

  public static int inversionselectionSort(int ary[]) {
    // ------------------------------------------------------------------------------

    int min;
    int result = 0;
    int minindex;
    for (int i = 0; i < ary.length; i++) {
      min = ary[i];
      minindex = i;
      for (int j = i + 1; j < ary.length; j++) {
        if (ary[j] < min) {
         
          min = ary[j];
          minindex = j;
        //   break;
        }
      }
      result += minindex - i;
      int temp = ary[i];
      ary[i] = min;
      ary[minindex] = temp;
        // System.out.print(ary[i]+" ");
    }

    // ------------------------------------------------------------------------------

    return result;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter size: ");
    int size = scn.nextInt();
    int ary[] = new int[size];
    // System.out.println("Enter data in ascending order");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }

    int result = inversionselectionSort(ary);
    System.out.println(result);

    scn.close();
  }
}
