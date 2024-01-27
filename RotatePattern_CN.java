import java.util.Scanner;

public class RotatePattern_CN {



	// 1 2 3 4
	// 2 3 4 1
	// 3 4 1 2
	// 4 1 2 3

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

