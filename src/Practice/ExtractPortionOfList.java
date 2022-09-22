//ExtractPortionOfList

import java.util.*;

public class ExtractPortionOfList {
    public static void main(String[] args) {
        List<String> Colours = new ArrayList<String>();
        Colours.add("yellow");
        Colours.add("Green");
        Colours.add("Orange");
        Colours.add("White");
        Colours.add("Black");
        System.out.println(Colours);
        List<String> sub_List = Colours.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);


    }
}