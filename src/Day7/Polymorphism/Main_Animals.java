package Day7.Polymorphism;

public class Main_Animals {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        Animal omnivorce = new Omnivores();
        omnivorce.eat();
    }
}
