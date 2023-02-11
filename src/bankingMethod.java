public interface bankingMethod {

    String AccountNo();
     int Withdraw(int withdrawn,String password);
    int balance();
    int Deposit(int toBeDeposit);
    double rateOfInterest(int time);

    String creditCardEligibility();


}
