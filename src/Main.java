import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String name=sc.next();
        int balance =sc.nextInt();
        String password = sc.next();
//        StateBankOfIndia account = new StateBankOfIndia(name,balance,password);
//        System.out.print(account.rateOfInterest(5)+" "+ account.Deposit(balance)+" "+account.getBalance());

        HDFC accountHDFC = new HDFC(name,balance,password);
        System.out.println(name+" "+ balance);
        System.out.println(accountHDFC.AccountNo()+" "+ balance);
        System.out.print("eligible for  creditcard"+" "+accountHDFC.creditCardEligibility());
    }
}