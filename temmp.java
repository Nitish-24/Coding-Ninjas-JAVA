import java.util.Scanner;

public class temmp {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int r, sum = 0, temp;
    int n = 1000; //It is the number variable to be checked for palindrome

    temp = n;
    while (n > 0) {
      r = n % 10; //getting remainder
      sum = (sum * 10) + r;
      n = n / 10;

    }
    if (temp == sum) System.out.println(
      "palindrome number "
    ); else System.out.println("not palindrome");
	scn.close();
	System.out.println(sum);
  }
}
