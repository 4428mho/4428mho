package calismalar2;

import java.util.ArrayList;
import java.util.List;

public class A1 {

        public static void main(String[] args) {
            String str = "Javaisalsoeasy";

            List<String> liste = new ArrayList<>();

            int toplam = 0;
            for (int i = 0; i < str.length(); i++) {

                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {

                        toplam++;

                    }
                }
                if (toplam > 1) {

                    if (!liste.contains(str.substring(i, i + 1))) {
                        liste.add(str.substring(i, i + 1));
                    }
                    toplam = 0;
                }

            }
            System.out.println(liste);

        }
}





