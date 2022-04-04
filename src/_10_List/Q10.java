package _10_List;

import java.util.ArrayList;

public class Q10 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */


    public static void main(String[] args) {
        int arr[]={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        ArrayList<Integer>toplananSayilarListesi=new ArrayList<>();
        int count=0;
        int topalanSayı=1;
        while (arr.length-topalanSayı>=count){
            int toplam=0;
            for (int i = 0; i <=count ; i++) {
                toplam+=arr[topalanSayı-1+i];

            }
            count++;
            topalanSayı+=count;
        }


    }

}

