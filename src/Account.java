public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        accountState = new ActiveState();
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState state) {
        this.accountState = state;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double depositAmount) {
        accountState.deposit(depositAmount, this);
    }

    public void withdraw(Double withdrawAmount) {
        accountState.withdraw(withdrawAmount, this);
        
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void close() {
        accountState.close(this);
    }

    @Override
    public String toString() {
        String string = "Account Number: " + accountNumber;
        string += "\nBalance: " + balance.toString() + "\n";
    
        return string;
    }
}