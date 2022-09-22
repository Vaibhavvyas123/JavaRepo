package Day5;

public class Student {

    private int rollNumber;
    private String name;
    private int standard;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() != 0) {
            this.name = name;
        }
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) throws IllegalArgumentException {
        if (this.age <= 6 && standard == 1) {
            this.standard = standard;
        }else{
            throw new IllegalArgumentException();
        }
    }


}

