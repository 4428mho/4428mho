package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        dizinBulmaca();

    }

    private static String dizinBulmaca() {
        Scanner scan=new Scanner(System.in);
        String str2="a";
        String str="xyz";
        do {
            System.out.println(" lütfen bir harf dizimi yazınız");
            str2 = scan.nextLine();
            if (!str2.contains(str)) {
                System.out.println("false");
                System.out.println("tekrar deneyiniz");
            }else if (str2.contains(str) ){
                System.out.println("true");
                System.out.println("işleminiz sonlanmıştır");
            }
        }
            while (!str2.contains(str));
                return str2;
}}
