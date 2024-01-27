import java.util.Scanner;

public class MaxAry_CN {
      public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
 
    int ary[] = new int[num];
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    int max = ary[0];
    for (int i : ary) {
      if (i > max) {
        max = i;
      }
    }
    System.out.println(max);
    scn.close();
  }
    
}
