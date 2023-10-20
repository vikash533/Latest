

 class Bank {
    String accountName ="vikash";
    long accountNo =9876543210l;
    double accountBalance =987653.56;
    public void details(){
        System.out.println("AccountHoldr"+accountName+"------>accountNo"+accountNo+"accountBalance------>"+accountBalance);
    }
}
class Deposite extends Bank{
    double deposite =98735;

    public void depositeAmount(){
        accountBalance = accountBalance+deposite;
        System.out.println("Total balance after deposite amdount "+accountBalance);
    }
}
public class Driver{
    public static void main(String[] args) {
        Deposite d = new Deposite();
        d.depositeAmount();
    }
}

