package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/


        isimEklemeMethodu();


    }

    private static String isimEklemeMethodu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir İsim Giriniz");
        String input = scan.nextLine();
        System.out.println("Bir İsim Daha Giriniz");
        String input2 = scan.nextLine();
        int str1=input.length();
        String y=input.substring(0,(str1/2));
        String x=input.substring((str1/2),str1);
        if ((str1%2)==0){
            System.out.println(y+""+input2+""+x);
        }else {
            System.out.println("olmadı ya kullanıcı");}
        return input+""+input2;
    }}
