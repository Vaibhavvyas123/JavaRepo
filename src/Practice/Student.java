public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<15) {
            this.age = age;
        }else{
            System.out.println("Error");
        }
    }

    public String getName(String akash) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
