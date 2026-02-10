public class ClosedState implements AccountState {
    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit on a closed account!");
        System.out.println(account);
    }

    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on a closed account!");
        System.out.println(account);
    }

    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!\n");
    }
    public void suspend(Account account) {
        account.setAccountState(new SuspendState());
        System.out.println("Account is suspended!\n");
    }
    
    public void close(Account account) {
        System.out.println("Account is already closed!\n");
    }
}