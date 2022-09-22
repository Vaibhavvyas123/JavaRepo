//SearchAnElement

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;

public class SearchAnElement {
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
        Colours.contains(3);
        if (Colours.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}