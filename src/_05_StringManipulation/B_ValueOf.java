package _05_StringManipulation;

public class B_ValueOf {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        String paraErkek = "1900";
        int x=Integer.valueOf(paraErkek);
        String paraKadin = "2000";
        int y=Integer.valueOf(paraKadin);
        //Bu ailenin toplam gelirini bulunuz.
        System.out.println(x+y);


        int maasErkek = 1900;
        int maasKadin = 2000;
        String a=String.valueOf(maasErkek);
        String b=String.valueOf(maasKadin);
        System.out.println("maasErkek" +a+" maasKadin "+b);

        //maasErkek ve maasKadin sayilarini String'e donusturn ve concatenation yapin



        String girilenKelime = "65";
        int girilenSayi=65;

        // kelimenin -> sayiya cevrilmesi
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime);
        System.out.println("girilenKelimeninSayiHali = " + girilenKelimeninSayiHali);// donusecek tipe uygun donusum
        short shortDeger = Short.parseShort(girilenKelime);
        System.out.println("shortDeger = " + shortDeger);
        double oran = Double.parseDouble(girilenKelime);
        System.out.println("oran = " + oran);


        // Soru : Short olarak atadığınız değeri stringe çevirerek,
        // ekrana yazdırınız.
        short xy=12354;
        String yx=String.valueOf(xy);
        System.out.println("yx = " + yx);



        //toString() methodu;
        short sayi=345;
        String abcd=String.valueOf(sayi);
        //Soru:  String olarak verilen 2 adet bagis parasının toplamini yazdiriniz.

        
        String bagis1="500";
        String bagis2="1500";

int ybagis=Integer.valueOf(bagis1);
int yzbagis=Integer.valueOf(bagis2);
        System.out.println("toplam bagıs = " + (yzbagis+ybagis));


        // Soru :String olarak verilen karenin 1 kenar uzunluğundan
        // karenin çevresinin uzunluğunu bulunuz.

        String kenar="8";
        int kareKenar=Integer.parseInt(kenar);

        System.out.println("(kareCevre) = " + (kareKenar*4));


    }
}
