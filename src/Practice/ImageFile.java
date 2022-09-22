import java.sql.SQLOutput;

public abstract class ImageFile {
    public void openfile()
    {
        System.out.println("open the file");
    }
    public void closeFile()
    {
        System.out.println("Close the file");
    }
    abstract void produceReport();

    public void send(){

        System.out.println("sending");

    }
}
