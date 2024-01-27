import java.util.Scanner;

public class ReverseCharPattern_CN {

// D
// DC
// DCB
// DCBA
  

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int Char = 'A'+num-1;

    for (int i = 1; i <= num; i++) {
      int temp = Char;
      for (int j = 1; j <= i; j++) {
        System.out.print((char)temp );
        temp--;
      }
      System.out.println();
    }
    scn.close();
  }
}
