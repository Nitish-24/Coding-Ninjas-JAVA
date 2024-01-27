import java.util.Scanner;

public class AreaCircle {

  public static double areaOfCircle(double num) {
    double ans = num * num * 3.14159;

    return ans;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double num = scn.nextDouble();

    areaOfCircle(num);
    scn.close();
  }
}
