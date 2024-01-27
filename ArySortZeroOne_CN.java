import java.util.Scanner;

public class ArySortZeroOne_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    //     7
    // 0 1 1 0 1 0 1
    //  ------------------------- taking input ------------
    System.out.println(" For array 1");
    int num = scn.nextInt();
    int ary[] = new int[num];
    int length = ary.length;
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    int count = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i] == 0) {
        count++;
      }
    }
    int ary2[] = new int[ary.length];
    int index=0;
    while (length != 0) {
      for (int i = index; i < ary.length; i++) {
        if (count > 0) {
          ary2[i] = 0;
          continue;
        } else if (count <= 0) {
          ary2[i] = 1;
          continue;
        }
    }
    index++;
    count--;
    length--;
}
    for (int i : ary2) {
      System.out.print(i + " ");
    }
    scn.close();
  }
}
