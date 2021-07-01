package THI.product;

public class ImportedProducts extends Product {
    private Double importPrices;
    private String importProvince;
    private Double importTax;

    public ImportedProducts() {
    }

    public ImportedProducts(Double importPrices, String importProvince, Double importTax) {
        this.importPrices = importPrices;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public ImportedProducts(String idProduct, String codeProduct, String nameProduct, Double price, int amount, String producer, Double importPrices, String importProvince, Double importTax) {
        super(idProduct, codeProduct, nameProduct, price, amount, producer);
        this.importPrices = importPrices;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public Double getImportPrices() {
        return importPrices;
    }

    public void setImportPrices(Double importPrices) {
        this.importPrices = importPrices;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public Double getImportTax() {
        return importTax;
    }

    public void setImportTax(Double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "idProduct :  " + getIdProduct() + " | Code product : " + getCodeProduct() + " | NameProduct : " + getNameProduct()
                + " | Price : " + getPrice() + " | Amount : " + getAmount() + " | Producer : " + getProducer()
                + " | ImportedProducts{" +
                "importPrices=" + importPrices +
                ", importProvince='" + importProvince + '\'' +
                ", importTax=" + importTax +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
