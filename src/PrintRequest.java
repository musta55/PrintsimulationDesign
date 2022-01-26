public class PrintRequest {
    private Document document;
    private PrintMode mode;


    /**
     * We don't need different object for different types of PrintModes because of Liskov Substitution Principle.
     * An object of PrintMode can be replaced by an object from any of its child.
     * */
    private PrioritySetting priority;

    public PrintRequest(Document document, PrintMode mode) {
        this.document = document;
        this.mode = mode;
        this.priority = new PrioritySetting(0);
    }
    public PrintRequest(Document document, PrintMode mode, PrioritySetting priority) {
        this.document = document;
        this.mode = mode;
        this.priority = priority;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public PrintMode getMode() {
        return mode;
    }

    public void setMode(PrintMode mode) {
        this.mode = mode;
    }

    public PrioritySetting getPriority() {
        return priority;
    }

    public void setPriority(PrioritySetting priority) {
        this.priority = priority;
    }


}
