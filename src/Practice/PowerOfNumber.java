import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
           int m,n;
          int res=1;
          m=scn.nextInt();
          n=scn.nextInt();

          for(int i=0;i<n;i++) {
               res = res * m;
              System.out.println("the result is "+res);
          }
    }
}