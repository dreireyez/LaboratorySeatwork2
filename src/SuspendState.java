public class SuspendState implements AccountState {
    public void deposit(Double depositAmount, Account account) {
        System.out.println("You cannot deposit on a suspended account!");
        System.out.println(account);
    }

    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("You cannot withdraw on a suspended account!");
        System.out.println(account);
    }

    public void activate(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!\n");
    }
    public void suspend(Account account) {
        System.out.println("Account is already suspended!\n");
    }
    
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!\n");
    }
}