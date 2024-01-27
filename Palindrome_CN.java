import java.util.Scanner;

public class Palindrome_CN {

  public static boolean checkPalindrome(int num) {
    int n = num;
   int newNumber =0, remainder;
    while (num != 0) {
      remainder = num%10;
      newNumber = newNumber *10 +remainder;
      num/=10;
    }
    System.out.println(newNumber);
    if (newNumber == n) {
      System.out.println("true");
      return true;
    } else {
      System.out.println("false");
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    checkPalindrome(num);
    scn.close();
  }
}
