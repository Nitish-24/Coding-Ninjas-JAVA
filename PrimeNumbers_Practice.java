import java.util.Scanner;

public class PrimeNumbers_Practice {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    byte flag = 0;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        flag = 1;
        break;
      }
    }
    if (flag==0) {
        System.out.println("Prime");
    }
    else
    System.out.println("Not Prime");
    scn.close();
  }
}
