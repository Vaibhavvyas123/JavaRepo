public class WrapperClass {
    public static void main(String[] args) {
        int a = 9;
        double d = 6.78;
        Integer b=a;
        Double c=d;
        System.out.println("d" + c );
        System.out.println("a" + b );

     //   Integer obj1 = Integer.valueOf(a);
       // Double obj2 = Double.valueOf(d);

        if(b instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if(c instanceof Double) {
            System.out.println("An object of Double is created.");
        }
    }
}
