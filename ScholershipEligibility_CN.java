import java.util.Scanner;

public class ScholershipEligibility_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println(" Enter Scholership test marks");
    float marks = scn.nextFloat();

    if (marks >= 65) {
      System.out.println(" Enter GPA");
      float GPA = scn.nextFloat();
      System.out.println(" Enter Stars in sports");
      float stars = scn.nextFloat();
      if (GPA >= 3.5 || stars >= 3) {
        System.out.println("Eligible");
      } else {
        System.out.println("Not Eligible");
      }
    }

    scn.close();
  }
}
