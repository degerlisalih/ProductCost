package salih.com;

public class SaleItem extends Product {

    double rateOfProfit = 0.30;
    double profit = (getPurchasePrice() + calculateKDV() + calculateStoppage() + productCost) * rateOfProfit;


    public double salePrice() {
        return getPurchasePrice() + calculateKDV() + calculateStoppage() + productCost + profit;
    }
}
