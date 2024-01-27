import java.util.Scanner;

public class StrAllSubString_CN {

  public static void printSubString(String str) {

    for (int i = 0; i <= str.length(); i++) {
        
        for (int j = i; j <= str.length(); j++) {
            
            System.out.println(str.substring(i, j));
        }
    }

  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    printSubString(str);
    // System.out.println(str.length());
    // System.out.println(str.substring(0, 2));
    scn.close();
  }
}
