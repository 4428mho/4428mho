package projects2.Projects_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cumle giriniz");
        String myStr = scan.nextLine();
        List<String>arr= List.of(myStr.split(" "));
        List<String>arr2 =new ArrayList<>();
        
        for (int i = 0; i < arr.size(); i++) {
            String metot= arr.get(i);
            String metin =metot.substring(0,1).toUpperCase()+metot.substring(1);
            arr2.add(metin);
                   }
        for (int i = 0; i < arr2.size(); i++) {
            System.out.print(arr2.get(i)+" ");
        }
        }


}


