package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        
        kelimeMethod();

    }

    public static String kelimeMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String input = scan.nextLine();
        String kelime1=input.substring(2);
        if (input.substring(0, 1).contains("g")&& input.substring(1, 2).contains("h")) {
            System.out.println(input);
        }else if (input.substring(0, 1).contains("g")){
            System.out.println("g"+kelime1);
        }else if (input.substring(1, 2).contains("h")){
            System.out.println("h"+kelime1);}
        else {
            System.out.println("output = " + kelime1);
        }
        return input;
    }
    }

