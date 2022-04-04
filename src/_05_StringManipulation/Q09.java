package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim=scan.nextLine();
        int str=isim.length();

        if (str%2==0){
            System.out.println(isim.substring(0,(str/2)));
        }else {
            System.out.println(isim);
        }

    }
}
