import java.util.Scanner;

public class PatternPractice_CN {

  //    *
  //   ***
  //  *****
  // *******





//   for(int k =0 ; k<star;k++){
//     System.out.print("* ");
//    }


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int temp = num;

    for (int i = 1; i <= num; i++) {
      for (int j = temp; j >i; j--) {
        //  for space
        System.out.print(" ");
      }
      for(int k =1 ; k<=(2*i-1);k++){
        System.out.print("*");
      }
      System.out.println();
    }
    scn.close();
  }
}
