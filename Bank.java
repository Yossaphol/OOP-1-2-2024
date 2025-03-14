public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank() {
        acct = new Account[10];
        numAcct = 0;
    }
    
    public void addAccount(Account ac) {
        if (numAcct < acct.length) {
            acct[numAcct] = ac;
            numAcct += 1;
        }
    }
    public Account getAccount(int index) {
        return acct[index];
    }
    public int getNumAcct() {
        return numAcct;
    }
}
