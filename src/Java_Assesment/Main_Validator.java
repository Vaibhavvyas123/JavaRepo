package Java_Assesment;

import java.util.Scanner;

public class Main_Validator {

    public static boolean validateIpv4Address(String s) {
        if (s.length() == 0) {
            return false;
        }
        if(s.charAt(0)=='.'|| s.charAt(s.length()-1)=='.'){
            return false;
        }
        String [] arr=s.split("\\.");
        if(arr.length!=4){
            return false;
        }
        for (String thisString:arr) {
            if(thisString.length()==0){
                return false;
            }
            if(thisString.length()>1){
                if(thisString.charAt(0)=='0'){
                    return false;
                }
            }
            int num=0;
            try{
                num=Integer.parseInt(thisString);
            }
            catch(NumberFormatException e){
                return false;
            }
            if(num<0||num>255)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ip Address ");
        String str= sc.nextLine();
        System.out.println( validateIpv4Address(str));
    }
}
