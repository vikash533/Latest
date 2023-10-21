package Inheritance;
public class Driv01{
    public static void main(String[] args) {
        Withdraw w = new Withdraw();
        w.accountBal01();
        w.display();

    }
}


    class Bank{
        String accntHolName = "vikash";
        int accountNo= 987654;
        int accountBal =100;
        public void accountBal01(){
            System.out.println(accountBal);
        }

    }
    class Deposite extends Bank {
        int depAmo = 200;
        public void depAmount(){
            accountBal=accountBal+depAmo;
        }

    }
    class Withdraw extends Deposite{
        int withDraw = 20;
        public void withDraw(){
            accountBal=accountBal-withDraw;
        }
        public void display(){
            System.out.println("Account holder name "+accntHolName);
            System.out.println("Account no "+accountNo);
            System.out.println("AccountBalance "+accountBal);
        }
    }

