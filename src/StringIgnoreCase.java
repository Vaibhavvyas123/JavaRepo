public class StringIgnoreCase {

    public static void main(String[] args){

        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "stephen edwin king";

        System.out.println("" +str1+ " equals " +str2+ "" + str1.equalsIgnoreCase(str2));
        System.out.println("" +str1+ " equals " +str3+ "" + str1.equalsIgnoreCase(str3));

    }

}

