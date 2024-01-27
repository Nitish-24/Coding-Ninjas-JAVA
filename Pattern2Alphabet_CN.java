import java.util.Scanner;

public class Pattern2Alphabet_CN {

    // ABCD
    // BCDE
    // CDEF
    // DEFG

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int charr = 'A';
    int charr2 = 'A';
    for (int i = 0; i < num; i++) {
        charr= charr2+i;
      for (int j = 1; j <= num; j++) {
        System.out.print((char) charr);
        charr++;
      }
      System.out.println();
    }
    scn.close();
  }
}
