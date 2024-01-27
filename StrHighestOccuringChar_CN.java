import java.util.Scanner;

public class StrHighestOccuringChar_CN {

  public static char highestOccuringCharacter(String str) {

// -----------------------NOT OPTIMIZED----------------------------

    char arr[] = new char[str.length()];
    arr = str.toCharArray();
    int length = str.length();
    int count = 0;
    int countOfLastfinalChar = 0;
    int iterartor = 0;
    char finalChar = arr[0];
    while (length != 0) {
      count = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[iterartor] == arr[i]) {
          count++;
        }
      }
      if (countOfLastfinalChar < count) {
        countOfLastfinalChar = count;
        finalChar = arr[iterartor];
      }
      length--;
      iterartor++;
    }

    return finalChar;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String input = scn.next();
    // System.out.println(" Enter character: ");
    // char charInput = scn.next().charAt(0);
    char result = highestOccuringCharacter(input);

    System.out.println(result);
    scn.close();
  }
}
