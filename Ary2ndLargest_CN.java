import java.util.Scanner;

public class Ary2ndLargest_CN {
     public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
 
    int ary[] = new int[num];
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    int max = ary[0];
    int max2=max;
    for (int i : ary) {
      if (i > max) {
        max2=max;
        max = i;
      }
      else if(i>max2)
      max2 =i;
    }
    System.out.println(max);
    System.out.println(max2);
    scn.close();
  }
    
}
