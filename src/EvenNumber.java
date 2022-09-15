import java.sql.SQLOutput;

public class EvenNumber {
    public static void main(String[] args) {
        int number=50;
        System.out.println("Even numbers from 1 to 50");
        for (int i=1;i<=number;i++)
        {
            if (i%2==0)
            {
                System.out.println(i + "" );
            }
        }
    }
}
