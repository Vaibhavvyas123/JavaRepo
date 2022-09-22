package Day2;

import java.util.Scanner;

public class StringEqualIgnoreCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.nextLine().toLowerCase();
        String str2=scanner.nextLine().toLowerCase();
        System.out.println(str2.equals(str1)?"they are equal":"they are not equal");
    }
}