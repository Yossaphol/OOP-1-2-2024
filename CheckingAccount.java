public class CheckingAccount extends Account{
    private double credit;

    public CheckingAccount() {
        super(0.0, "");
        this.credit = 0.0;
    }
    
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0){
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void withdraw(double a) throws WithdrawException {
        if (a > 0 && (balance - a >= 0)) {
            balance -= a;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit +".");
        } else if (a > 0 && ((balance + credit) - a >= 0)) {
            balance -= a;
            credit += balance;
            balance = 0;
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit +".");
        } else if (a > 0 && (balance - a) < 0) {
            throw new WithdrawException("Account " + name + " has not enough money.");
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public void withdraw(String a) throws WithdrawException{
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
