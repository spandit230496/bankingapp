import java.util.UUID;

public class StateBankOfIndia implements bankingMethod{
    private String Name;
    private int balance;
    private double ROI;
    private String password;
    private String accountNo;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getROI() {
        return ROI;
    }

    public void setROI(double ROI) {
        this.ROI = ROI;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
//details of the person
    public StateBankOfIndia(String name, int balance, String password) {
        this.Name = name;
        this.balance = balance;
        this.password = password;
        this.accountNo= String.valueOf(UUID.randomUUID());
        this.ROI=2.75;

    }

    @Override
    public String AccountNo() {

        return accountNo;
    }

    @Override
    public int Withdraw(int withdrawn,String password) {
     if(password.equals(this.password)) {
         balance-=withdrawn;
         return withdrawn;
     }
     else System.out.print("password is incorrect ! Try another") ;


     return 0;
    }

    @Override
    public int balance() {
        return this.balance;
    }

    @Override
    public int Deposit(int toBeDeposit) {
        balance+=toBeDeposit;
        return balance;
    }

    @Override
    public double rateOfInterest(int time) {
   //PTR/100     ;
        ROI=(balance*time*ROI)/100.0;

        return ROI;
    }

    @Override
    public String creditCardEligibility() {
        if(this.balance>50000)return "YES";

        return "NO";
    }
}
