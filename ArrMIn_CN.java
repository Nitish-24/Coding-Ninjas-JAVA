import java.util.Scanner;

public class ArrMIn_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
 
    int ary[] = new int[num];
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    int min = ary[0];
    for (int i : ary) {
      if (i < min) {
        min = i;
      }
    }
    System.out.println(min);
    scn.close();
  }
}
