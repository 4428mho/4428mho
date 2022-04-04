package _08_While_DoWhile;

import java.util.Scanner;

public class AsalCarpan {
        static  int bolen=0;
        static boolean isAsal=true;
        public static void main(String[] args) {
            /* TASK :
             * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
             * METHOD create ediniz.
             *
             * Ör: Input : 50
             *     Bolenler : 2,5,10,20,50
             *     Asal Bolenler: 2,5
             *     En buyuk asal carpan: 5
             */
            Scanner scan=new Scanner(System.in);
            System.out.println("sayı giriniz = ");
            int sayi=scan.nextInt();
            asalCarpan(sayi);
        }
            private static void asalCarpan(int sayi) {
            int asalBolen=0;
                for (int i = 2; i <=sayi ; i++) {
                    if (sayi%i==0){
                        bolen=i;
                        asalMı(bolen);
                    }if (isAsal){
                        asalBolen=bolen;
                    }
                }
                System.out.println("asalBolen = " + asalBolen);
    }
    private static boolean asalMı(int bolen) {
        for (int i = 2; i <bolen ; i++) {
            if (bolen%i==0){
                isAsal=false;
                break;
            }
        }
        return isAsal;
    }
}

