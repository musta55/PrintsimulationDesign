public class Document {
    private String content;
    private int numOfPages;
    private PageSize pageSize;
    private String orientation;
    private double colorIntensity;

    public Document(String content, int numOfPages, PageSize pageSize, String orientation) {
        this.numOfPages = numOfPages;
        this.pageSize = pageSize;
        this.orientation = orientation;
        this.colorIntensity = colorIntensity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public PageSize getPageSize() {
        return pageSize;
    }

    public void setPageSize(PageSize pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public double getColorIntensity() {
        return colorIntensity;
    }

    public void setColorIntensity(double colorIntensity) {
        this.colorIntensity = colorIntensity;
    }


    public void decreaseColorIntensity(double v) {
    }

    public int getNumberOfPages() {
        return 0;
    }
}
