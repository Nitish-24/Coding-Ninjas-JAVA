import java.util.Scanner;

public class FibonachiMember_CN {

  public static boolean fb(int n) {
    int num = n;
    int firstnum = 0;
    int secondnum = 1;
    int nextnum;

    nextnum = firstnum + secondnum;
    if (n == 0) {
      // System.out.println("true ");
      return true;
    } else {
      while (num >= nextnum) {
        if (num == nextnum) {
          // flag++;
          // System.out.println("true " + nextnum);
          return true;
        } else {
          nextnum = firstnum + secondnum;
          firstnum = secondnum;
          secondnum = nextnum;
        }
      }
    }

    // System.out.println("false " + nextnum);
    return false;
  }

  public static void main(String[] args) {
    // 0 1 1 2 3 5 8 13 21 34
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = scn.nextInt();
    fb(num);
    scn.close();
  }
}
