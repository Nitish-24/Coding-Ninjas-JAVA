import java.util.Scanner;

public class StrReverse_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    String char2 = "";
    char temp;
    for (int i = str.length() - 1; i >= 0; i--) {
      temp = str.charAt(i);
      char2 += temp;
    }
    System.out.println(char2);
    scn.close();
  }
}
