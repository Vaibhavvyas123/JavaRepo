package Day5;

public class Solution {
    public static void main(String[] args) {
        try {
            Adder myAdder = new Adder();
            myAdder.add(1, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}