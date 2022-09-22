package Day4;//UpdateArrayList

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayList {
    public static void main(String[] args) {
        List<String> Colours = new ArrayList<String>();
        Colours.add("yellow");
        Colours.add("Green");
        Colours.add("Orange");
        Colours.add("White");
        Colours.add("Black");
        System.out.println(Colours);
        String element =Colours.get(0);
        System.out.println("First element: "+element);
        Colours.set(3,"BlackForest");
        System.out.println(Colours);
    }
}