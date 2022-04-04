package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};


        List<Integer> tekrarsız = new ArrayList<>();// list oluşturuldu boş list

        for (Integer n : arr
        ) {
            if (!tekrarsız.contains(n)) {// for each metodu ile arr deki elemanlardan ilk sayıyı yerleştir aynısı varsa list e koymaa
                tekrarsız.add(n);
            }
        }
        Collections.sort(tekrarsız);

        int arr2[]=new int [tekrarsız.size()];// ikinci arr oluşturduk
        for (int i = 0; i <tekrarsız.size() ; i++) {
            arr2[i]=tekrarsız.get(i);

        }
        System.out.println(Arrays.toString(arr2));
    }
}
