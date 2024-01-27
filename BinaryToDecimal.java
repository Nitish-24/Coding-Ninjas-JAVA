import java.util.Scanner;

public class BinaryToDecimal {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int result = 0;
    int i = 1;
    while (num != 0) {
      int lastDigit = num % 10;
      result = result + lastDigit * i;
      num = num / 10;
      i *= 2;
    }
    System.out.println(result);
    scn.close();
  }
}
