import java.util.Scanner;

public class Pattern2_Alphabet_CN {


    // AAAA
    // BBBB
    // CCCC
    // DDDD

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int charr = 'A';
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= num; j++) {
        System.out.print((char)charr);
      }
      System.out.println();
      charr++;
    }
    scn.close();
  }
}
