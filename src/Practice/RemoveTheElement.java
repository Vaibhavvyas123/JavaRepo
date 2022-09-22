//RemoveTheElement

import java.util.*;

public class RemoveTheElement{
    public static void main(String[] args) {
        List<String> Colours = new ArrayList<String>();
        Colours.add("yellow");
        Colours.add("Green");
        Colours.add("Orange");
        Colours.add("White");
        Colours.add("Black");
        System.out.println(Colours);
        Colours.add(0, "Purple");
        System.out.println(Colours);
        Colours.remove(2);
        System.out.println("After Removing the element" + Colours);
    }
}
