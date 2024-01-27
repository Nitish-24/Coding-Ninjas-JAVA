import java.util.Scanner;

public class StrReverseEachWord_CN {

  public static String reverseWord(String str) {
    String char2 = "";
    char temp;
    for (int i = str.length() - 1; i >= 0; i--) {
      temp = str.charAt(i);
      char2 += temp;
    }
    // System.out.println(char2);
    return char2;
  }

  public static void main(String[] args) {
    String newString = "";
    Scanner scn = new Scanner(System.in);

    String str = scn.nextLine();
    //   int a = 10;
    String result[] = str.split(" ");
    for (int i = 0; i < result.length; i++) {
        String CurrentWord = result[i];
        String reversedCurrentWord = reverseWord(CurrentWord);
        newString += reversedCurrentWord+" ";
    }
    System.out.println(newString);
    scn.close();
  }
}
