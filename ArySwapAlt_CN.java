import java.util.Scanner;

public class ArySwapAlt_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();
    while (size != 0) {
      int num = scn.nextInt();

      int ary[] = new int[num];
      for (int i = 0; i < ary.length; i++) {
        ary[i] = scn.nextInt();
      }
      for (int i = 0; i < ary.length;) {
        if (i == ary.length - 1) {
          break;
        } else {
          int temp = ary[i];
          ary[i] = ary[i + 1];
          ary[i + 1] = temp;
        }
        i = i + 2;
      }
      for (int i : ary) {
        System.out.print(i + " ");
      }
      size--;
    }
    scn.close();
  }
}
