package Day6.Duck;

public class Main_Multilevel {

    public static void main(String[] args) {
        Granfather granfather = new Granfather();
        Granfather.swim();

        Father f1=new Father();
        f1.swim();
       Granfather father=new Father();
        father.swim();



    }
}
