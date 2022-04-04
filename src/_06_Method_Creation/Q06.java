package _06_Method_Creation;

public class Q06 {

 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {


        String metin="aabbcccccddddaaa";


        karakterBulma(metin);
    }

    private static String karakterBulma(String metin) {

        int metin2=metin.indexOf('a');
        System.out.println("metin2 = " + metin2);
        String metin3=metin.substring(1);
        System.out.println("metin3 = " + metin3);
        int metin4=metin.indexOf("b");
        System.out.println("metin4 = " + metin4);
        int metin5=metin.indexOf("c");
        System.out.println("metin5 = " + metin5);
        int metin6=metin.indexOf("d");
        System.out.println("metin6 = " + metin6);

        
    return metin;
}}
