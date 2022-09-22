package Day2;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int random=  new Random().nextInt(101);
        System.out.println("enter the number");
        int num=sc.nextInt();
        do{


            if(num>random){
                System.out.println("Too High");
                num=sc.nextInt();
            }
            if(num<random){
                System.out.println("Too low");
                num=sc.nextInt();
            }
        }while (num!=random);
        System.out.println("the number was "+num);
    }
}
