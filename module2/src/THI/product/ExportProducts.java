package THI.product;

public class ExportProducts extends Product {
    private double exportPrice;
    private String countryOfEntry;

    public ExportProducts() {
    }

    public ExportProducts(double exportPrice, String countryOfEntry) {
        this.exportPrice = exportPrice;
        this.countryOfEntry = countryOfEntry;
    }

    public ExportProducts(String idProduct, String codeProduct, String nameProduct, Double price, int amount, String producer, double exportPrice, String countryOfEntry) {
        super(idProduct, codeProduct, nameProduct, price, amount, producer);
        this.exportPrice = exportPrice;
        this.countryOfEntry = countryOfEntry;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getCountryOfEntry() {
        return countryOfEntry;
    }

    public void setCountryOfEntry(String countryOfEntry) {
        this.countryOfEntry = countryOfEntry;
    }

    @Override
    public String toString() {
        return "idProduct :  " + getIdProduct() + " | Code product : " + getCodeProduct() + " | NameProduct : " + getNameProduct()
                + " | Price : " + getPrice() + " | Amount : " + getAmount() + " | Producer : " + getProducer()
                +
                " | ExportProducts{" +
                "exportPrice=" + exportPrice +
                ", countryOfEntry='" + countryOfEntry + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
