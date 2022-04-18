package calismalar2;

import java.util.Scanner;

public class A20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input=");
        String input=scan.nextLine();
        String arr[]=input.split("");
        String k="";
        for (int i=arr.length ; i>0 ; i--) {
            k+=arr[i-1];
        }
        System.out.println("Output = " + k);
    }
}
