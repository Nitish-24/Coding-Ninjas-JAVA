import java.util.Scanner;

public class StrCompreseString_CN {

  // Sample Input 1:
  // aaabbccdsa
  // Sample Output 1:
  // a3b2c2dsa

  public static String compressString(String s) {
    // ======================================================================================
    int count = 1;
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < s.length() - 1; i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        count++;
      } else {
        sb.append(s.charAt(i - 1));
        sb.append(count);
        count = 1;
      }
    }

    if (s.length() > 1) {
      if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
        count++;
      } else {
        sb.append(s.charAt(s.length() - 2));
        sb.append(count);
        count = 1;
      }
      sb.append(s.charAt(s.length() - 1));
      sb.append(count);
    }
    s = sb.toString();
    // -------------------------------REMOVING 1 FROM UPPER COPIED CODE-------------------
    System.out.println("\n" + s);
    char arr[] = new char[s.length()];
    arr = s.toCharArray();
    String newStr = "";
    for (int i = 0; i < arr.length; i++) {
      char temp = arr[i];
      if (temp == '1') {
        continue;
      } else {
        newStr += temp;
      }
    }

    return newStr;
    // ======================================================================================
    // String newString = "";

    // char arr[] = new char[str.length()];
    // int length = str.length();
    // arr = str.toCharArray();
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {
    //   if (i == length - 1) {
    //     newString += arr[length - 1];
    //   } else {
    //     count = 0;
    //     char temp1 = arr[i];
    //     char temp2 = arr[i + 1];
    //     if (temp1 == temp2) {
    //       while (temp1 == temp2) {
    //         count++;
    //         temp2++;
    //       }
    //       newString += temp1 + count;
    //     } else {
    //       newString += temp1;
    //     }
    //   }
    // }

    // return newString;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input = scn.next();
    String result = compressString(input);

    System.out.println(result);
    scn.close();
  }
}
