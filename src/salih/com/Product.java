package salih.com;


public class Product extends PurchaseItem implements Ratings, Cost {

    double productCost;
    double oilLitrePrice = 6.50;//TL
    double totalOverheads;

    @Override
    public double calculateKDV() {
        return getPurchasePrice() * rateOfKDV;
    }

    @Override
    public double calculateStoppage() {
        return getPurchasePrice() * rateOfStoppage;
    }

    @Override
    public double productCost(double workmanship, double packing) {
        return this.productCost = workmanship + packing;
    }

    @Override
    public double logistics(double oil) {
        return oil * oilLitrePrice;
    }

    @Override
    public double overheads(double rent, double electric, double gas, double water) {
        return totalOverheads = rent + electric + gas + water;
    }


}
