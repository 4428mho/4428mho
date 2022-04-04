package _03_IfStatement_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		*
		 */
          Scanner scan=new Scanner(System.in);
		System.out.println("LÜTFEN IT ALANINIZIN KISALTMASINI GİRİNİZ");
		 String meslek= scan.next().toUpperCase();



				if (meslek.equals("QA")){
				System.out.println("Quality Analyst= " + meslek);
				}
				else if (meslek.equals("DEV")){
				System.out.println("Developer= " + meslek);
				}
				else if (meslek.equals("BA")){
				System.out.println("Busines Analyst= " + meslek);
				}else if (meslek.equals("PM")){
					System.out.println("Project Manager= " + meslek);
				} else {
					System.out.println("Lütfen Geçerli bir Kısaltma giriniz");}
	}
				}
