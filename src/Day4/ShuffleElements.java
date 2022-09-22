package Day4;//ShuffleElements

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElements {
    public static void main(String[] args) {
        List<String> Colours = new ArrayList<String>();
        Colours.add("yellow");
        Colours.add("Green");
        Colours.add("Orange");
        Colours.add("White");
        Colours.add("Black");
        System.out.println(Colours);
        Collections.shuffle(Colours);
        System.out.println(Colours);
    }
}