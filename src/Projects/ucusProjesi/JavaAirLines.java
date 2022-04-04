package Projects.ucusProjesi;

import java.util.Locale;
import java.util.Scanner;

public class JavaAirLines {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir rota seciniz...\n  B C D rotalarından birini seçiniz: ");
        String city=scan.next().toUpperCase();
        System.out.println("tek yön inin 1\n gidiş-dönüş için 2 yi tuşlayınız");
        int flytipe=scan.nextInt();
        System.out.println("yaşınız  ?  ");
        int age=scan.nextInt();
        double priceC=1.10*700;
        double priceB=1.10*800;
        double priceD=1.10*900;
        if (city.equals("B")||city.equals("C")||city.equals("D")){
            if (age>65){
                if (city.equals("B")){
                    if (flytipe==1){
                        System.out.println("Ticket   :\n "+priceB*0.7+"$");

                    }else if(flytipe==2){
                        System.out.println("*****************");
                        System.out.println("Ticket   :\n "+priceB*0.8*0.2+"$");

                    }else System.out.println("hata");}

                   else if (city.equals("C")){
                        if (flytipe==1){
                            System.out.println("Ticket   :\n "+priceC*0.8+"$");

                        }else if(flytipe==2){
                            System.out.println("*****************");
                            System.out.println("Ticket   :\n "+priceC*0.8*0.2+"$");

                        }else System.out.println("hata");}
                else if (city.equals("D")){
                    if (flytipe==1){
                        System.out.println("Ticket   :\n "+priceD*0.7+"$");

                    }else if(flytipe==2){
                        System.out.println("*****************");
                        System.out.println("Ticket   :\n "+priceD*0.8*0.2+"$");

                    }else System.out.println("hata");}
                }
            }

        if (age>65){
            if (city.equals("B")){
                if (flytipe==1){
                    System.out.println("Ticket   :\n "+priceB*0.7+"$");

                }else if(flytipe==2){
                    System.out.println("*****************");
                    System.out.println("Ticket   :\n "+priceB*0.8*0.2+"$");

                }else System.out.println("hata");}

            else if (city.equals("C")){
                if (flytipe==1){
                    System.out.println("Ticket   :\n "+priceC*0.8+"$");

                }else if(flytipe==2){
                    System.out.println("*****************");
                    System.out.println("Ticket   :\n "+priceC*0.8*0.2+"$");

                }else System.out.println("hata");}
            else if (city.equals("D")){
                if (flytipe==1){
                    System.out.println("Ticket   :\n "+priceD*0.7+"$");

                }else if(flytipe==2){
                    System.out.println("*****************");
                    System.out.println("Ticket   :\n "+priceD*0.8*0.2+"$");

                }else System.out.println("hata");}
        }
    }
}
