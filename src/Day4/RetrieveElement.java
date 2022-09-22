package Day4;//RetrieveElement

import java.util.ArrayList;
import java.util.List;

public class RetrieveElement {
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
    }
}