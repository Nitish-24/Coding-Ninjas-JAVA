import java.util.Scanner;

public class AryUnique_CN {

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
    int ans = ary[0];
    // int index = 0;
    //----------------------------- checking unique---------------
    if (ary.length == 1) {
      System.out.println(ary[0]);
    } else {
      boolean isUnique;

      for (int i = 0; i < ary.length; i++) {
        isUnique = true; // Assume ary[i] is unique until proven otherwise
        for (int j = 0; j < ary.length; j++) {
          if (i == j) {
            continue;
          } else if (ary[i] == ary[j]) {
            isUnique = false; // ary[i] is not unique
            break;
          }
          // if (j == (ary.length - 1)) {
          //   // System.out.print(ary[i] + " ");
          //    ans = ary[i];
          //   // return ans;
          // }

        }
        if (isUnique) {
          ans = ary[i];
          break; // No need to check further, we found the unique element
        }
      }
      //    return ans ;
      System.out.println(ans);
    }

    scn.close();
  }
  //   size--;
}
