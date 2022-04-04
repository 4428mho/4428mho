package _03_IfStatement_TernaryOperator;
import java.util.Scanner;
public class Q08_kaza {
        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);

            System.out.println("aldığınız ürün adedini yazınız");
            int ürünAdedi=scan.nextInt();

            System.out.println("alığınız ürünün liste fiyatnı yazınız (₺)");
            double listeFiyatı=scan.nextDouble();
            double d1=ürünAdedi*listeFiyatı;
            double i1=(d1-d1*(0.2));
            double i2=(d1-d1*(0.15));
            double i3=(d1-d1*(0.1));
            System.out.println("Müşteri Kartınız var mı? ");
            String cevap =scan.next().toUpperCase();
            System.out.println("cevap = " +cevap);
            if ((cevap.equals("EVET")&&ürünAdedi>20)){
                System.out.println("toplam fiyat = "+d1+" \n % 20 indirimli fiyat =" +i1);}
            else if ((cevap.equals("EVET")&&ürünAdedi<=20)){
                System.out.println(("toplam fiyat = "+d1+" \n % 15 indirimli fiyat ="+i2));}
            else if ((cevap.equals("HAYIR")&&ürünAdedi>10)){
                System.out.println("toplam fiyat = "+d1+"\n % 15 indirimli fiyat ="+i2);}
            else {
                System.out.println("toplam fiyat = "+d1+"\n % 10 indirimli fiyat ="+i3);
            }
                
            }
        }

    

