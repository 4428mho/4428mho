package _06_Method_Creation;

import java.util.Scanner;

public class Q07 {
    /*      TASK:
        reverseString isminde bir method create ediniz.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten print etsin.


        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */

    public static void main(String[] args) {
        String metin = "Java'yı Seviyorum.";
        String tersmetin=reverseString(metin);
        System.out.println(tersmetin+"||Java'yı Seviyorum.");
    }
    public static String reverseString(String metin) {
        String m1="";
        for (int i = metin.length()-1; i >-1 ; i--) {
            m1=m1+metin.substring(i,i+1);
        }
        return m1;
    }

}
