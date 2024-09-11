
public class RewardValue {

     double cashValue;
    double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue; // Initialize cashValue

    }

    // Constructor that accepts a miles value
    public RewardValue(int  milesValue) {
        this.milesValue = milesValue; // Initialize milesValue

    }

    // Method to get cash value (converts miles to cash)
    public double getCashValue() {
        return milesValue*0.0035;
    }

    // Method to get miles value (converts cash to miles)
    public double getMilesValue() {
        return cashValue/0.0035;
    }

}