package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen Yaşınızı giriniz");
		double yaş =scan.nextDouble();
		System.out.println("lütfen kilonuzu giriniz");
		double kilo =scan.nextDouble();
		if (yaş>0&&yaş<18){
			System.out.println(	"kan bağışı yapamaz");
		}else if(yaş>18&&kilo<=50){
			System.out.println("kan bağışı yapamaz");
		}else if(yaş>18&&kilo>50){
			System.out.println("kan bağışı yapailir");
		}else {
			System.out.println("kan bağışı yapamaz");
		}


	}

}
