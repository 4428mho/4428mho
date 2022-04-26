package _17_Set;

import java.util.ArrayList;
import java.util.List;

public class HashSet03 {
    /*

	 		Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz bir collection elde etmek isterseniz ne kullanirsiniz
	    	Cevap: TreeSet

	 		Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
	 	    Cevap: HashSet olustururum, elemanlari HashSet'e eklerim.
	 	    Sonra HashSet'i TreeSet'e ceviririm boylece tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum.
     */
    public static void main(String[] args) {
        /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        ArrayList<Integer>c=new ArrayList<>();
        ArrayList<Integer>d=new ArrayList<>();
        a=(ArrayList<Integer>) ABC(10,20,0);
        b=(ArrayList<Integer>) ABC(5,20,0);

        c=a;
        c.removeAll(b);
        b=d;
        d.removeAll(a);
        System.out.println("d = " + d);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    public static int getRandom(int max,int min){
        return (int)(Math.random()*max-min+1);
    }
    private static  List<Integer> ABC(int size, int max,int min) {
        List<Integer>son=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            son.add(getRandom(max,min));

        }return son;
    }
}
