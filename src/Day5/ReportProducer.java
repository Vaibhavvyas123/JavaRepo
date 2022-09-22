package Day5;

public abstract class ReportProducer {
    abstract void produceReport();
    void  openFile(){
        System.out.println("opening file....");
    }
    void  closeFile(){
        System.out.println("closing file....");
    }
    void shareFile(){
        System.out.println("Share file via Slack....");
    }
}