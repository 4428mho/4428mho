package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
      
       */
        String isimSoyisim="Muhammet Orhan";
        int str1=isimSoyisim.length();
        int str=isimSoyisim.indexOf(" ");
        String yeniIsim=isimSoyisim.substring(0,str);
        String yeniSoyIsım=isimSoyisim.substring(str+1,(str1));
        System.out.println("yeniSoyIsım = " + yeniSoyIsım);
        System.out.println("yeniIsim = " + yeniIsim);
    }
}
