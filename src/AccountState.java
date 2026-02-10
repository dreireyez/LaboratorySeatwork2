public interface AccountState {
    public void deposit(Double depositAmount, Account account);
    public void withdraw(Double withdrawAmount, Account account);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
}