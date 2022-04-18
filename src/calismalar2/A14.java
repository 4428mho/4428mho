package calismalar2;

public class A14 {
    public static void main(String[] args) {


        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int ortalama=0;
        int toplam=0;


        for (int i = 0; i <input.length ; i++) {
            toplam+=input [i];

        }
        ortalama=toplam/input.length;
        System.out.println("ortalama = " + ortalama);


    }
}