package Day2;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Base");
        int base=scanner.nextInt();
        System.out.println("Enter the Power");
        int power=scanner.nextInt();
        int ans=1;
        for(int i=0;i<power;i++){
            ans=ans*base;
        }
        System.out.println(ans);
    }
}