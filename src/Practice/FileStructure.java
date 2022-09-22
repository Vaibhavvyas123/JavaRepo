package Practice;

public class FileStructure extends File {

    public static void main(String[] args) {
        FileStructure file=new FileStructure();
    }

    @Override
    void produceReport() {

        System.out.println("Overriden method");
    }
}
