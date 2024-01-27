import java.util.Scanner;

public class TotalSalary_CN {

  public static void main(String[] args) {
    // totalSalary = basic + hra + da + allow – pf
    // where :
    // hra   = 20% of basic
    // da    = 50% of basic
    // allow = 1700 if grade = ‘A’
    // allow = 1500 if grade = ‘B’
    // allow = 1300 if grade = ‘C' or any other character
    // pf    = 11% of basic.

    Scanner scn = new Scanner(System.in);
    int basicSalary = scn.nextInt();
    char grade = scn.next().charAt(0);
    double hra = 0.20 * basicSalary;
    double da = 0.50 * basicSalary;
    double pf = 0.11 * basicSalary;
    int allow;

    if (grade == 'A') {
      allow = 1700;
    } else if (grade == 'B') {
      allow = 1500;
    } else allow = 1300;

    double totalSalary = basicSalary + hra + da + allow - pf;
    int ans = (int) Math.round(totalSalary);
    System.out.println(ans);
    scn.close();
  }
}
