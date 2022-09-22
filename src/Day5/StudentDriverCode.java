package Day5;

public class StudentDriverCode {


    public static void main(String[] args) {
        Student Vaibhav= new Student();
        Vaibhav.setAge(6);
        Vaibhav.setName("Abhi");
        Vaibhav.setRollNumber(3);
       Vaibhav.setStandard(1);
        System.out.println(Vaibhav.getName()+" "+Vaibhav.getAge()+" "+Vaibhav.getStandard()+" "+Vaibhav.getRollNumber());
    }
}