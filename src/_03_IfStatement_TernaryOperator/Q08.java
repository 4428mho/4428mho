package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("aldığınız ürün adedini yazınız");
		int ürünAdedi=scan.nextInt();
		System.out.println("alığınız ürünün liste fiyatnı yazınız (₺)");
		double listeFiyatı=scan.nextDouble();
		System.out.println("Müşteri Kartınız var mı? \n Evet \n Hayır");
		boolean cevap =scan.nextBoolean();
		System.out.println("boy uzunluğunuzu girin (cm)");
		double boy =scan.nextDouble();

	}

}
