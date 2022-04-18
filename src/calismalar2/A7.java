package calismalar2;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       System.out.println("input=");
       String input=scan.nextLine();
       String k="";

        for (int i =input.length(); i> 0; i--) {
            k+=input.substring(i-1,i);

        }
        System.out.print("output=  "+k);
    }

   // String tersKarakter=imput.substring(imput.length()-1)
       //     +imput.substring(2,3)
      //      +imput.substring(1,2)
        //    +imput.substring(0,1);
}
