package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		/* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
		Scanner scan=new Scanner(System.in);
		System.out.println(" lütfen bir metin yazınız");
		String str2=scan.nextLine();
		System.out.println(" lütfen bir harf  yazınız");
		String x=scan.nextLine();
		char y=x.charAt(0);
		int sayac=0;

		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i)==y){
				sayac++;}
		}System.out.println("harfin kullanım sayısı  = " + sayac);
	}
}

