package calismalar2;

import java.util.ArrayList;
import java.util.List;

public class A22 {
    public static void main(String[] args) {
        List<Integer> output = new ArrayList<>();
        List<Integer> output2 = new ArrayList<>();
        int input = 9;
        int sayac = 0;
        for (int sayi = 2; sayi <= 100; sayi++) {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0) {
                output.add(sayi);
                System.out.println("sayi = " + sayi);
                sayac++;
            }
        }

        System.out.println(output);
        for (int i = 0; i < 25; i++) {
            if(input>=output.get(i)){
                System.out.print(output.indexOf(i));
            }

        }


            }
        }





