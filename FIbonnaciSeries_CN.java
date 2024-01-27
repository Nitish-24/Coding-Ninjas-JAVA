import java.util.Scanner;

public class FIbonnaciSeries_CN {

  public static void main(String[] args) {
    // 0 1 1 2 3 5 8 13 21 34
    Scanner scn = new Scanner(System.in);
    System.out.println(
      "Enter the numbers of count you want fibonnaci series of : "
    );
    int num = scn.nextInt();
    int firstnum = 0;
    int secondnum = 1;
    int nextnum;
    if (num == 0) {
      System.out.println("Enter  a valid input ");
    } else if (num == 1) {
      System.out.println(" 0 ");
    } else if (num == 2) {
      System.out.println(" 0 1 ");
    } else {
      System.out.print(firstnum + " ");
      System.out.print(secondnum +" ");
      while (num - 2 > 0) {
        nextnum = firstnum+ secondnum;
        System.out.print(nextnum +" ");
        firstnum =secondnum;
        secondnum= nextnum;
        num--;
      }
    }
    scn.close();
  }
}
