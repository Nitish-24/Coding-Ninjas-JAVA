import java.util.Arrays;
import java.util.Scanner;

public class StrCheckPermutation_CN {

  // abcde
  // baedc

  public static void checkpermutation(String str1, String str2) {

    int l1 = str1.length();
    int l2 = str2.length();
    if (l1 != l2) {
      System.out.println("false");
      // return false;
    }
    char ch1[] = str1.toCharArray();
    char ch2[] = str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);

    for (int i = 0; i < l1; i++) {
      if (ch1[i] != ch2[i]) {
        System.out.println("false");
        // return false;
      }
    }
    System.out.println("true");
    // return true;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input = scn.next();
    String input2 = scn.next();
    // System.out.println(" Enter character: ");
    // char charInput = scn.next().charAt(0);
    checkpermutation(input, input2);

    // System.out.println(result);
    scn.close();
  }
}
