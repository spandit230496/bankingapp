public class HDFC implements bankingMethod{


    private String name;
    private String accountNo;
    private int withdrawn;
    private double ROI;
    private String password;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(int withdrawn) {
        this.withdrawn = withdrawn;
    }

    public double getRateOfInt(int time) {
        return ROI;
    }

    public void setRateOfInt(double rateOfInt) {
        this.ROI = ROI;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HDFC(String name, int withdrawn, String password) {
        this.name = name;
        this.withdrawn = withdrawn;
        this.password = password;
        this.accountNo=("5010020"+(int)(Math.random() * 90) + 10);
        this.ROI=2.25;
    }
    public String AccountNo(){

        return accountNo;
    }
    @Override
    public int Withdraw(int withdrawn, String password) {
        if(password.equals(this.password))
        {
           if(withdrawn<=this.balance){
               this.balance-=withdrawn;
               System.out.print("remaining balance is");
                return balance;
           }


        }

        else

            System.out.print("insufficient balance");

        return 0;
    }

    @Override
    public int  balance(){
        return this.balance;
    }

    @Override
    public int Deposit(int toBeDeposit) {
        this.balance+=toBeDeposit;
        System.out.print("updated balance"+this.balance);

        return this.balance;
    }

    @Override
    public double rateOfInterest(int time) {
        //PTR/100
        ROI=(balance*time*ROI)/100.0;

        return ROI;
    }
    @Override
    public String creditCardEligibility() {
        if(this.balance>50000)return "YES";

        return "NO";
    }
}
