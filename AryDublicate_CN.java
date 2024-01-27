import java.util.Scanner;

public class AryDublicate_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // int size = scn.nextInt();
    // while (size != 0) {
    int num = scn.nextInt();
    //  ------------------------- taking input ------------
    int ary[] = new int[num];
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    // int ans = ary[0];
    if (ary.length == 1) {
      System.out.println(ary[0]);
    }
    //   ----------- checking dublicate--------------------
    boolean isDublicate;

    for (int i = 0; i < ary.length; i++) {
      isDublicate = false;
      for (int j = 0; j < ary.length; j++) {
        if (i == j) {
          continue;
        }
        if (ary[i] == ary[j]) {
          isDublicate = true;
          break;
        }
      }
      if (isDublicate == true) {
        System.out.println(ary[i]);
        break;
      }
    }

    scn.close();
  }
}
