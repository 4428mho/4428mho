package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen  isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("lütfen  Soyisminizi giriniz");
        String soyIsim = scan.nextLine();
        System.out.println("kk numaranızı giriniz");
        String kk = scan.nextLine();
        if (kk.length() < 15 || kk.length() > 16) {
            System.out.println("geçersiz");
        }else{
            String yeniKKNo = "**** **** **** " + kk.substring(12);
            String str1 = isim.substring(0, 1);
            String str2 = isim.substring(1, isim.length());
            String yIsim = str1 + "" + str2.replaceAll("\\w", "*");
            String str3 = soyIsim.substring(0, 1);
            String str4 = soyIsim.substring(1, soyIsim.length());
            String ysyisim = str3 + "" + str4.replaceAll("\\w", "*");
            System.out.println("İsim = " + yIsim + " \nSoyİsim = " + ysyisim);
            System.out.println("yeniKKNo = " + yeniKKNo);
            }
        }}
