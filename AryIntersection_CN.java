import java.util.Scanner;

public class AryIntersection_CN {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    //  ------------------------- taking input ------------
    System.out.println(" For array 1");
    int num = scn.nextInt();
    int ary1[] = new int[num];
    for (int i = 0; i < ary1.length; i++) {
      ary1[i] = scn.nextInt();
    }
    //  ------------------------- taking input ------------
    System.out.println(" For array 2");
    int num2 = scn.nextInt();
    int ary2[] = new int[num2];
    for (int i = 0; i < ary2.length; i++) {
      ary2[i] = scn.nextInt();
    }

    for (int i = 0; i < ary1.length; i++) {
      for (int j = 0; j < ary2.length; j++) {
        if (ary1[i] == ary2[j]) {
          System.out.print(ary2[j] + " ");
        }
      }
    }
// -------------------------PENDING-------------------------


//     int a=0;
//     for(int i=0;i<ary1.length;i++)
//     {
//        for(int j=0;j<ary2.length;j++)
//        {
//            if(ary1[i]==ary2[j])
//            {
//             a=ary1[i];
           
         
//        System.out.print(a+" "); 
//         ary2[j]=Integer.MAX_VALUE;
            
//    break;
//     }
   
//        }
//     }
   



    scn.close();
  }
}
