package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElementOFArraylist {
    public static void main(String[] args) {
        List<String> Colours = new ArrayList<String>();
        Colours.add("yellow");
        Colours.add("Green");
        Colours.add("Orange");
        Colours.add("White");
        Colours.add("Black");
        System.out.println(Colours);
        Collections.reverse(Colours);
        System.out.println("After reversing an element" + Colours);
    }
}
