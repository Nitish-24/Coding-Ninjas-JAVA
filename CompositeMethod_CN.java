import java.util.Scanner;

public class CompositeMethod_CN {


public static void print_composite(int num){
    for(int i =2 ; i<=num ;i++){
        if(i==2)
        continue;
         if(i%2==0)
         System.out.println(i);
         else
         is_prime(i);
    }
}
public static void is_prime(int num){
    byte flag = 0;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        flag = 1;
        break;
      }
    }
    if (flag==0) {
        // System.out.println("Prime");
        return;
    }
    else
    System.out.println(num);
    return;
   
}


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        print_composite(num);
        scn.close();
    }
}
