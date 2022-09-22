package Day6.Duck;

public class RubberDuck implements Noise,Squeezable{
    @Override
    public void MakeNoise() {
        System.out.println("making noise");
    }

    @Override
    public void squeez() {
        System.out.println("Can Squeez");
    }
}