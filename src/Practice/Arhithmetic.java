class Arhithmetic {

    public int add(int a,int b){
        int sum= a+b;
        return sum;
    }

}

class adder extends Arhithmetic
{


}

class Inheritance{
    public static void main(String[] args) {
        adder a=new adder();
        System.out.println("Calling SuperClass" + a.getClass().getSuperclass().getName());
        System.out.println(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10));
    }

}
