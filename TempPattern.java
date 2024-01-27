import java.util.Scanner;

public class TempPattern {

  public static void main(String[] args) {

    
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			for (int j = i; j < i + num; j++) {
				int k = j % num;
				if (k==0) {
					k = num;
				}
		        System.out.print(k+" ");
		    }
			
			System.out.println();
		}
        scn.close();
	}
}


    // int i, j, k;
    // for (i = 1; i <= num; i++) {
    //   k = i - 1;
    //   for (j = i; j < i + num; j++) {
    //     if (j <= num) {
    //       System.out.print(j);
    //     } else {
    //       System.out.print(k--);
    //     }
    //   }
    //   System.out.println();
    // }

    // for (int i = 1; i <= num; i++) {
    //

  
