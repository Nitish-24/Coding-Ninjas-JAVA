import java.util.Scanner;

public class TriangleCheck_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();

    if (a < (b + c) && b < (a + c) && c < (a + b)) {
      if (a == b && b == c) {
        System.out.println("Equilateral traingle");
      } else if (
        (a == b) || (c == b ) || (c == a)
      ) {
        System.out.println("Isoselous Triangle");
      } else System.out.println("Scalene Triangle");
    } else System.out.println("Not a valid Triangle");

    //   -------------------OLD LOGIC-----------------------
    // int sum = a + b + c;s
    // if ((a < (b + c)) || (b < (a + c)) || (c < (b + a))) {
    //   if ((a == b) && (b == c)) {
    //     System.out.println("Equilateral Triangle");
    //   } else if ((a != b) && (b != c)) {
    //     System.out.println("Scalene Triangle");
    //   } else System.out.println("Isosceles Triangle");
    // } else System.out.println("Not a Triangle");
    //   ---------------OLD- LOGIC--------------------------
    scn.close();
  }
}
