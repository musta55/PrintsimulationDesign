public class TonerSaveMode extends PrintMode {
    private String tonerSavingLevel;

    public TonerSaveMode(int costPerPage, String tonerSavingLevel) {
        super(costPerPage);
        this.tonerSavingLevel = tonerSavingLevel;
    }
    public void saveToner(Document input){
        if(tonerSavingLevel.equals("high")){
            input.decreaseColorIntensity(1.0);
            System.out.println("Color intensity changed to save Toner");
        }
        else if(tonerSavingLevel.equals("medium")){
            input.decreaseColorIntensity(2.0);
            System.out.println("Color intensity changed to save Toner");
        }
        else{
            input.decreaseColorIntensity(3.0);
            System.out.println("Color intensity changed to save Toner");
        }
    }

    /**
     * moved this method to PageSavingMode.java Class  because this method  needs in only
     * PageSavingMode. So It would have violated the Interface Segregation Principle.
     * */
}
