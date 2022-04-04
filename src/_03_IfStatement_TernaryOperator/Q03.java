package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("kilonuz giriniz( kg) giriniz");
        double kilo =scan.nextDouble();
        System.out.println("boy uzunluğunuzu girin (cm)");
        double boy =scan.nextDouble();
        double BMI = (kilo/(boy*boy))*10000;
        System.out.println("BMI = " + BMI);
        if (20<BMI&&BMI<=25){
            System.out.println("normal sınırdasınız");
        }else if(BMI<=20){
            System.out.println("oldukça zayıfsınız");
        }else if (25<BMI&&BMI<=30){
            System.out.println("şişman kategorisindesiniz");
        }else {
            System.out.println("obez gurubundasınız");
        }

    }
}