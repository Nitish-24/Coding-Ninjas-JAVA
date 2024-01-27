import java.util.Scanner;

public class StrWordCount_CN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        // int count=0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i)== ' ') {
        //         count++;
        //     }

        // }
     String s[]=   str.split(" ");
        // System.out.println(count+1);
        System.out.println((s.length));
        scn.close();
    }
}
