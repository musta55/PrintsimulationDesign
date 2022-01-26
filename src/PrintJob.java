import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class PrintJob {
    private Queue printRequest;

   //private  PrioritySetting priority;

    public PrintJob(PrintRequest printRequest) {
        printRequest = printRequest;
    }
    /**
    // Priority is the job of priority setting class.
    // So it would violate single responsibility principle
    //    public void changePriority(int priority) {
//    }
     **/
    public PrintJob() {
        printRequest = new Queue() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }
        };
    }

    public void addJob(PrintRequest printReq){
        printRequest.add(printReq);
    }

    public void pullJob(){
        PrintRequest request = (PrintRequest) printRequest.remove();
        System.out.println(request.getDocument().getContent()+" successfully printed");
    }

    public void startJob(PrintRequest pr) {

    }
}
