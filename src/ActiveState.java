public class ActiveState implements AccountState {
    public void deposit(Double depositAmount, Account account) {
        Double newBalance = account.getBalance() + depositAmount;
        account.setBalance(newBalance);
        System.out.println(account);
    }

    public void withdraw(Double withdrawAmount, Account account) {
        Double currentBalance = account.getBalance();
        if (withdrawAmount > currentBalance) {
            System.out.println("Insufficient balance!");
        } else {
            Double newBalance = currentBalance - withdrawAmount;
            account.setBalance(newBalance);
        }
        System.out.println(account);
    }

    public void activate(Account account) {

        System.out.println("Account is already activated!\n");
    }
    public void suspend(Account account) {
        account.setAccountState(new SuspendState());
        System.out.println("Account is suspended!\n");
    }
    
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!\n");
    }
}