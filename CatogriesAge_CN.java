import java.util.Scanner;

public class CatogriesAge_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    if (num >= 0 && num <= 4) {
      System.out.println("Infants");
    } else if (num >= 5 && num <= 12) {
      System.out.println("Children");
    } else if (num >= 13 && num <= 64) {
      System.out.println("Adults");
    } else {
      System.out.println("Seniors");
    }
    scn.close();
  }
}
