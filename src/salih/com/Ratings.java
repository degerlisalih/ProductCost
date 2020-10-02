package salih.com;


public interface Ratings {

    double rateOfKDV = 0.18;
    double rateOfStoppage = 0.20;

    double calculateKDV();

    double calculateStoppage();

}
