package _10_List;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
Scanner scsn =new Scanner(System.in);
        System.out.println(" bir mertin giriniz");
        String arr[]=scsn.nextLine().split("");

        String enCoktkrr="";
        int maxSayac=0;
        int sayac=0;
        for (int i = 0; i < arr.length; i++) { //ilk index karşılaştırılan karakter ilk karakter sabit kalır alt satıra geçer
            for (int j = i+1; j < arr.length; j++) {// karşılaştırılan kendinden bir sonraki karakterle başlayan diğer karakterler. üsteeki sabit karakterle diğer kalanı karşıaştırır ve sononda ikinci ye geçer.4
        if (arr[i].equalsIgnoreCase(arr[j])){
            sayac++;
        }
            } if (sayac>maxSayac){
                maxSayac=sayac;
                enCoktkrr=arr[i];
            }else if (sayac==maxSayac){
                enCoktkrr+=" ,"+arr[i];

            }
            sayac=0;
        }

        System.out.println("enCoktkrr = " + enCoktkrr+" ==>> "+maxSayac+ "   defa kullanılmış");
    }
}

