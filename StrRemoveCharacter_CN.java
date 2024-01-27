import java.util.Scanner;

public class StrRemoveCharacter_CN {

  // aabccbaa
  // a
  // Sample Output 1:
  // bccb

  public static String removeCharacter(String str, char ch) {
    char arr[] = new char[str.length()];
    arr = str.toCharArray();
    String newStr = "";
    for (int i = 0; i < arr.length; i++) {
      char temp = arr[i];
      if (temp == ch) {
        continue;
      } else {
        newStr += temp;
      }
    }

    return newStr;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input = scn.next();
    System.out.println(" Enter character: ");
    char charInput = scn.next().charAt(0);
    String result = removeCharacter(input, charInput);

    System.out.println(result);
    scn.close();
  }
}
