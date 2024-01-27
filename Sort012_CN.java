import java.util.Scanner;

public class Sort012_CN {

public static void sort012(int ary[]) {
    for (int i = 1; i < ary.length; i++) {
        int j = i - 1;
        int temp = ary[i];
        while (j >= 0 && ary[j] > temp ) {
          ary[j + 1] = ary[j];
          j--;
        }
        ary[j + 1] = temp;
      }
}

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
    int size = scn.nextInt();
    int ary[] = new int[size];
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    sort012(ary);
    for (int i : ary) {
      System.out.print(i + " ");
    }
    scn.close();
    }
}
