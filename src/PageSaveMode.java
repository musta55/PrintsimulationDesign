public class PageSaveMode extends PrintMode {
    public PageSaveMode(int costPerPage) {
        super(costPerPage);
    }
    public Document savePages (Document inputDocument) {
        System.out.println("Applied page saving algorithm on Document");
        String content = inputDocument.getContent();
        int pageNumber = inputDocument.getNumberOfPages() - 2;

        Document output = new Document(content,pageNumber, inputDocument.getPageSize(), inputDocument.getOrientation());

        return output;
    }

    /**
     * moved this method to PageSavingMode.java Class  because this method  needs in only
     * PageSavingMode. So It would have violated the Interface Segregation Principle.
     * */


    public void renderPreview(Document input){
        System.out.println(input.getContent());
        System.out.println(input.getNumberOfPages()+ " pages");
    }
}

