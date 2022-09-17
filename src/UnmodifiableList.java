
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class UnmodifiableList  {
    public static void main(String args[]) {
        List <String> aList = new ArrayList<>();
        aList.add("Vaibhav");
        aList.add("Akash");
        aList.add("Prashant");

        aList = Collections.unmodifiableList(aList);
        System.out.println("The ArrayList elements are: " + aList);
    }
}