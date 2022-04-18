package calismalar2;

import java.util.ArrayList;
import java.util.List;

public class A10 {
    public static void main(String[] args) {
        List<String>k=new ArrayList<>();
        String Input ="Coding is greate.";
        for (int i =Input.length(); i> 0; i--) {
            k.add(Input.substring(i-1,i));
        }
        System.out.println(k);
        for (int i = 0; i < k.size(); i++) {
            System.out.print(k.get(i));

        }
    }
}
