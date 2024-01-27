import java.util.Scanner;

public class ArySumOfTwoAry_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // int carry = 0;

    System.out.println("Capacity 1st: ");
    int capacity = scn.nextInt();

    int ary[] = new int[capacity];

    System.out.println("Enter data in array :");
    for (int i = 0; i < ary.length; i++) {
      ary[i] = scn.nextInt();
    }
    System.out.println("Capacity 2nd: ");
    int capacity2 = scn.nextInt();

    int ary2[] = new int[capacity2];

    System.out.println("Enter data in array :");
    for (int i = 0; i < ary2.length; i++) {
      ary2[i] = scn.nextInt();
    }
    int max = (capacity > capacity2) ? capacity : capacity2;
     int sum[] = new int[max];

    sumOfTwoArrays(ary, ary2, sum);
    scn.close();
  }
  // System.out.println(max);
  
    public static void sumOfTwoArrays(int ary1[], int ary2[], int total[]) {
    	//Your code goes here
        // if(ary1.length>ary2.length){
        //     int max = ary1.length;
        // }
        // else if(ary2.length > ary1.length){
        //     int max = ary2.length;
        // }
        // else{
        // int max = ary1.length;
        // }
     int n1 = ary1.length;
     int n2 = ary2.length;

  int i = n1 - 1;
    int j = n2 - 1;
    int k = total.length - 1;
    int c = 0;
    while(i >= 0 || j >= 0){
       int d = c;

       if(i >= 0)
         d += ary1[i];

      if(j >= 0)
         d += ary2[j];

       c = d / 10;
       d = d % 10;
       total[k] = d;

       i--;
       j--;
       k--;
    }

    if(c > 0){
       total[0]=c;
      
    }
    for(int val: total){
       System.out.print(val+ " ");
    }
    // int
  }
}
