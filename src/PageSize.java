public class PageSize {
    private int height;
    private  int weight;
    private int padding;

    public PageSize(int height, int weight, int padding) {
        this.height = height;
        this.weight = weight;
        this.padding = padding;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }
}
