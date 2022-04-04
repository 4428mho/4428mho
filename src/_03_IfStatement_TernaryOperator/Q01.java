package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 *
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("toplama için 1\nçarpma için 2\nçıkarma içim 3\nbölme için 4 ");
		int islem = scan.nextInt();
		System.out.println("Lütfen iki tam syı giriniz");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		if (islem==1){
			System.out.println("toplam :" + num1 +"+" + num2 + "=" +(num1+num2));
		}else if (islem==3){
			System.out.println("çıkarma  :" + num1 +"-" + num2 + "=" +(num1-num2));
		} else if (islem==2){
			System.out.println("çarpma  :" + num1 +"x" + num2 + "=" +(num1*num2));
		}else if (islem==4){
			System.out.println("bölme  :" + num1 +"/" + num2 + "=" +(num1/num2));
		} else {
			System.out.println("hatalı seçim yaptınız");
		}
	}

}
