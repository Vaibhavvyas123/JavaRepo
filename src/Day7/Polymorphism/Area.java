package Day7.Polymorphism;

class Area {

    void area(int x)
    {
        System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(int x, int y)
    {
        System.out.println("The area of the rectangle is "+x*y);
    }


}
