package Practice;//SortTheList

import java.util.*;

public class SortTheList  {
    public static void main(String[] args) {
        List<String> Colours = new ArrayList<String>();
        Colours.add("yellow");
        Colours.add("Green");
        Colours.add("Orange");
        Colours.add("White");
        Colours.add("Black");
        System.out.println(Colours);
        Collections.sort(Colours);
        System.out.println("Sorted Arraylist "+ Colours);
    }
}