package Practice;

public class Student_class {

    public static void main(String[] args) {
        Student std=new Student();
        std.setAge(15);
        std.setName("Akash");
        System.out.println(std.getAge());
        std.setAge(18);
        System.out.println(std.getAge());
    }
}
