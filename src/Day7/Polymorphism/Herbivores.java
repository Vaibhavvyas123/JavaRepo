package Day7.Polymorphism;

public class Herbivores extends Animal{

    @Override
    void eat() {
        System.out.println("Eating only plants" );
    }
}
