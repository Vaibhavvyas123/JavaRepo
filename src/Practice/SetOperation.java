import java.util.HashMap;
import java.util.Map;

public class SetOperation {
    public static void main(String[] args) {
        Map<Integer,String> mymap=new HashMap<>();
        mymap.put(100,"VAibhav");
        mymap.put(100,"anjsdk");
        mymap.put(1001,"VAibhav");
        mymap.put(1009,"VAibhav");
        System.out.println(mymap);
    }
}
