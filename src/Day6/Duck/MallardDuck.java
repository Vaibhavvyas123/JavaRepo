package Day6.Duck;

public class MallardDuck implements Walkable,Flyable,Noise,Swimable{
    @Override
    public void Fly() {
        System.out.println("flying");
    }

    @Override
    public void MakeNoise() {
        System.out.println("making noise");
    }

    @Override
    public void swim() {
        System.out.println("swimming...");
    }

    @Override
    public void walk() {
        System.out.println("Walking....");
    }


}