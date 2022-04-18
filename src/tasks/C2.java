package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C2 {
        public static void main(String[] args) {



            List<Double> sayilar=new ArrayList<>();
            List<Double> sayilar2=new ArrayList<>();
            Scanner scan=new Scanner(System.in);
            double n=scan.nextInt();
            for (double i = 1; i <=n ; i++) {
                sayilar.add(i);
            }
            Scanner scan1=new Scanner(System.in);
            double r=scan.nextInt();

            for (double i = 1; i <=r ; i++) {
                sayilar2.add(i);
            }
            System.out.println(sayilar);
            System.out.println(sayilar2);



            }

        }

