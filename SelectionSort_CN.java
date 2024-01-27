import java.util.Scanner;

public class SelectionSort_CN {

//     7
// 2 13 4 1 3 6 28


  public static void selectionSort(int ary[]) {
    // int length = ary.length - 1;
    int min;
    int minindex ;
    for (int i = 0; i < ary.length; i++) {
      min = ary[i];
      minindex=i;
      for (int j = i+1; j < ary.length; j++) {
        if (ary[j] < min) {
          min = ary[j];
          minindex = j;
          // break;
        }
      }
      int temp = ary[i];
      ary[i] = min;
      ary[minindex] = temp;
    //   System.out.print(ary[i]+" ");
    }
    for (int i : ary) {
      System.out.print(i + " ");
    }
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

    selectionSort(ary);

    scn.close();
  }
}
