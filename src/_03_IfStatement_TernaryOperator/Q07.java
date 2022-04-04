package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("LÜTFEN BİR HARF YAZINIZ");
		char harf= scan.next().charAt(0);
		System.out.println("girilen karakter = " + harf);
		if (harf>='a'&&harf<='z'){
			System.out.println("Girilen Değer Küçük Harftir");
		}else if(harf>='A'&&harf<='Z'){
			System.out.println("Girilen Değer Büyük Harftir");
		} else {
			System.out.println("girilen değer harf değildir");}



	

	}

}
