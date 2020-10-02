package salih.com;

public class PurchaseItem {
    private String name;
    private double purchasePrice;
    private double amount;
    private double unitPrice;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPurchasePrice() {
        this.purchasePrice = getAmount() * getUnitPrice();
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public String toString() {
        return getName() + "@ " + getPurchasePrice();
    }


}
