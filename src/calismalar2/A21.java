package calismalar2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A21 {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        List<String> list2 = new ArrayList<>();
        String str="";

        for (int i = 0; i < list1.size(); i++) {
           str=list1.get(i);
            if(!str.toLowerCase().contains("a")){
                list2.add(list1.get(i));
            }
        }
        System.out.println("list2 = " + list2);
    }
}
