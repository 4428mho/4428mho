package calismalar2;

import java.util.Scanner;

    public class A9 {
    public static void main(String[] args) {
        tersineCevir();
    }

    private static String tersineCevir() {
        Scanner scan=new Scanner(System.in);
        System.out.print("input=");
        String input=scan.nextLine();
        String k="";

        for (int i =input.length(); i> 0; i--) {
            k+=input.substring(i-1,i);

        }
        System.out.print("output="+k);
        return k;
    }

    }

