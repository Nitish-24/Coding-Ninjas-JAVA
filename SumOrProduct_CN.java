import java.util.Scanner;

public class SumOrProduct_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter number :");
    int num = scn.nextInt();
    System.out.println("Enter choice 1 to add and 2 for Product :");
    int choice = scn.nextInt();
    int sum = 0;
    int product = 1;
    if (choice == 1) {
      for (int i = 1; i <= num; i++) {
        sum += i;
      }
      System.out.println(sum);
    } else if (choice == 2) {
      for (int i = 1; i <= num; i++) {
        product *= i;
      }
      System.out.println(product);
    } else System.out.println("-1");
    scn.close();
  }
}
