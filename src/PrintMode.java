

public class PrintMode {
    private int noOfPages;
    private PageSize pageSize;
    private String orientation;
    private int colorIntensity;
    private int costPerPage;

    public PrintMode(int costPerPage) {
        this.costPerPage = costPerPage;
    }

    public int getCostPerPage() {
        return costPerPage;
    }

    public void setCostPerPage(int costPerPage) {
        this.costPerPage = costPerPage;
    }

    //    public void saveToner(Docs input){
//    }
    /**
     * moved this method to TonerSaverMode.java Class because this method  needs in only
     * Toner saver mode. So It would have violated the Interface Segregation Principle.
     * */
//    public void boost(Docs input){
//    }
    /**
     * moved this method to BoostMode.java Class  because this method  needs in only
     * BoostMode. So It would have violated the Interface Segregation Principle.
     * */
//    public Docs savePages(Docs inputDocument){
//    }

    /**
     * moved this method to PageSavingMode.java Class  because this method  needs in only
     * PageSavingMode. So It would have violated the Interface Segregation Principle.
     * */
}


