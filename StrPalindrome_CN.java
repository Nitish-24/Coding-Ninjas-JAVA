import java.util.Scanner;

public class StrPalindrome_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    int first = 0;
    int last = str.length() - 1;
    int flag = 0;
    while (last > first) {
      char a = str.charAt(first);
      char b = str.charAt(last);
      if (a != b) {
        System.out.print("Not ");
        flag++;
        break;
      }
      last--;
      first++;
    }
    if (flag == 0) {
      System.out.println("yes");
    }
    scn.close();
  }
}
