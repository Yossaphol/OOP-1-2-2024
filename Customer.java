public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numofAccount;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
        numofAccount = 0;
    }

    public Customer() {
        this("","");
    }
    
    public Account getAccount(int index) {
        return acct[index];
    }
    
    public void addAccount(Account acc) {
        acct[numofAccount] = acc;
        numofAccount += 1;
    }
    
    public int getNumOfAccount() {
        return numofAccount;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + ", numofAccount=" + numofAccount + '}';
    }
    
    
}
