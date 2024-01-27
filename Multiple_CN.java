import java.util.Scanner;

public class Multiple_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  num = scn.nextInt();
      if (num%5==0) {
        System.out.println("Multiple of 5");
      }
      else
      System.out.println("Not a Multiple of 5");
      scn.close();
    }
}
