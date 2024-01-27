import java.util.Scanner;

public class PyramidOfNumbers_CN {

//      1
//     2 2
//    3 3 3
//   4 4 4 4


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int temp = num;
    // int count = 1;

    for (int i = 1; i <= num; i++) {
    //   count = 1;
      for (int j = temp; j >= i; j--) {
        //  for space
        System.out.print(" ");
      }
      for (int k = 1; k <=  i; k++) {
        System.out.print(i+" ");
        
      }
      System.out.println();
    }
    scn.close();
  }
}
