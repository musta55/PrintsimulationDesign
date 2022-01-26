public class BoostMode extends  PrintMode{
    private double intensityThreshold;

    /** It follows single responsibility principle
     *
     * @param costPerPage
     * @param intensityThreshold
     */
    public BoostMode(int costPerPage, double intensityThreshold) {
        super(costPerPage);
        this.intensityThreshold = intensityThreshold;
    }

    //It is brought from printMode class to maintain  Interface Integration Principle
    public void Boost(Document input){
        input.setColorIntensity(intensityThreshold);
        System.out.println("boosted successfully");
    }



    public double getIntensityThreshold() {
        return intensityThreshold;
    }

    public void setIntensityThreshold(double intensityThreshold) {
        this.intensityThreshold = intensityThreshold;
    }
}
