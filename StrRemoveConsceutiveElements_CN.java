import java.util.Scanner;

public class StrRemoveConsceutiveElements_CN {

  // Input String: "aabbbcc"
  // Expected Output: "abc"

  public static String removeelements(String str) {
    char arr[] = new char[str.length()];
    arr = str.toCharArray();
    String newStr = "";
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        newStr += arr[i];
      } else {
        char temp1 = arr[i];
        char temp2 = arr[i + 1];

        if (temp1 == temp2) {
          continue;
        } else {
          newStr += temp1;
        }
      }
    }
    return newStr;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input = scn.next();

    String result = removeelements(input);

    System.out.println(result);
    scn.close();
  }
}
