package calismalar2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A17 {
    public static void main(String[] args) {

        add1();

    }

    private static List<Integer> add1() {

        List<Integer> Input1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> Input2 = new ArrayList<>(Arrays.asList(5,6));
        List<Integer> Output = new ArrayList<>();
        for (int i = 0; i < Input1.size(); i++) {
            Output.add(Input1.get(i));
        }
        for (int i = 0; i < Input2.size(); i++) {
            Output.add(Input2.get(i));
        }
        System.out.println(Output);
        return Output;
    }
}
