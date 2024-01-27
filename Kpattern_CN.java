import java.util.Scanner;

public class Kpattern_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
		
		int i, j;
		
		// System.out.print("Enter K Shape Number Pattern Rows = ");
		int rows = scn.nextInt();
		
		// System.out.println("Printing K Shape Numbers Pattern");		
		
		for (i = rows; i >= 1; i-- ) 
		{
			for (j = 1 ; j <= i; j++ ) 	
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		for (i = 2 ; i <= rows; i++ ) 
		{
			for (j = 1 ; j <= i; j++ ) 	
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
    }
}
