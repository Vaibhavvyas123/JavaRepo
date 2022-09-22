package Day2;

import java.util.Scanner;

public class CharacterAtIndex {
    static  char characterAtIndexMethod(String str, int index){
        return str.charAt(index);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string\n");
        String str=scanner.nextLine();
        System.out.println("Enter the index range[0-"+str.length()+"]");
        int index= scanner.nextInt();
        System.out.println(characterAtIndexMethod(str,index));
    }
}