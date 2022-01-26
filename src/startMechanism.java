import java.util.Queue;

public class startMechanism {

    public void start(){
        PageSize pageSize=new PageSize(100,100,100);
        Document doc=new Document("This is SOLD Principle application",20,pageSize,"Low");
        PrintMode mode=new PrintMode(2);
        PrintRequest pr=new PrintRequest(doc,mode);
        System.out.println("Mechanism initialized...");
        PrintJob pJob=new PrintJob(pr);
        pJob.startJob(pr);
    };

}
