import java.util.Scanner;

public class Ary2Dtranspose_CN {

  public static void main(String[] args) {
    // 1 2
    // 2 3
    // 3 4

    // 1 2 3
    // 2 3 4
    Scanner scn = new Scanner(System.in);
    int no = scn.nextInt();
    int mo = scn.nextInt();
    // int max2 = (n > m ? n : m);
    int ary[][] = new int[no][mo];
    // int sumAry[] = new int[max2];

    for (int i = 0; i < no; i++) {
      for (int j = 0; j < mo; j++) {
        ary[i][j] = scn.nextInt();
      }
    }
    int ary2[][] = new int[mo][no];

    for (int i = 0; i < mo; i++) {
        for (int j = 0; j < no; j++) {
             ary2[i][j]= ary[j][i];
        }
        
    }
    for (int i = 0; i < mo; i++) {
        for (int j = 0; j < no; j++) {
            System.out.print(ary2[i][j]+ " ");
        }
        System.out.println();
    }
    scn.close();
  }
}
