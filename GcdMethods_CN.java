import java.util.Scanner;

public class GcdMethods_CN {

  public static int findGcd(int a, int b) {
    int result = 0;
    if (a > b) {
      for (int i = 1; i <= a; i++) {
        if (a % i == 0 && b % i == 0) {
          result = i;
        }
      }
    } else {
      for (int i = 1; i <= b; i++) {
        if (a % i == 0 && b % i == 0) {
          result = i;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num1 = scn.nextInt();
    int num2 = scn.nextInt();

    findGcd(num1, num2);
    scn.close();
  }
}
