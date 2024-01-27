import java.util.Scanner;

public class Grade_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    if (num < 0 || num > 100) {
      System.out.println("Invalid score");
    } else {
      if (num >= 0 && num < 60) {
        System.out.println("F");
      } else if (num >= 60 && num < 70) {
        System.out.println("D");
      } else if (num >= 70 && num < 80) {
        System.out.println("C");
      } else if (num >= 80 && num < 90) {
        System.out.println("B");
      } else if (num >= 90 && num <= 100) {
        System.out.println("A");
      }
    }
    scn.close();
  }
}
