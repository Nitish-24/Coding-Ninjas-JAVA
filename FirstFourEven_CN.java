import java.util.Scanner;

public class FirstFourEven_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (i % 2 == 0 && count < 4) {
        System.out.println(i);
        count++;
        if (count==4) {
          break;
        }
      }
    }
    scn.close();
    
  }
}
