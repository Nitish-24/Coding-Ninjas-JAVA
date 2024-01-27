import java.util.Scanner;

public class ArrSum_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int ary[] = new int[n];
    int sum = 0;


    for(int i=0 ; i<n ;i++){
        ary[i]= scn.nextInt();
    }
    for(int i=0 ; i<n ;i++){
        sum+=ary[i];
    }
    System.out.println(sum);
    scn.close();
  }
}
