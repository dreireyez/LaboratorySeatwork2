# Laboratory Seatwork 2
This is Laboratory Seatwork 2 for the course, Software Engineering 2, taken during the Second Semester of Academic Year, 2025-2026, at New Era University.

## Problem Statement
<p>A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.
</p>

<ul>
  <li><b>Active accounts:</b> Allow deposits and withdrawals.</li>
  <li><b>Suspended accounts:</b> Disallow deposits and withdrawals transactions, but allow viewing account information.</li>
  <li><b>Closed accounts:</b> Disallow all transactions and viewing of account information.</li>
</ul>
<p>Currently, the system relies on conditional statements within the <b>Account</b> class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.</p>
<p>Implement the State pattern to improve code maintainability and flexibility:</p>
<ol>
  <li><b>Define Account States:</b> Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState.</li>
  <li><b>Implement State Interface:</b> Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close.</li>
  <li><b>Implement State Behaviors:</b> Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions.</li>
  <li><b>Update Account Class:</b>
    <ul>
      <li>Include attributes for accountNumber and balance.</li>
      <li>Remove state-specific logic from the Account class.</li>
      <li>Introduce a reference to the current AccountState object.</li>
      <li>Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.</li>
    </ul>
  </li>
</ol>

### Logic
- If the account is active, you can either suspend it or close it.
- If the account is suspended, you can either activate or close it. No deposits and withdrawals allowed.
- If the account is closed, you can neither suspend nor activate it. No deposits and withdrawals allowed.

### Composition of Account
- accountNumber: String
- balance: Double
- accountState: AccountState
  
### Methods
- deposit(Double depositAmount): void
- withdraw(Double withdrawAmount): void
- suspend(): void
- activate(): void
- close(): void
- toString()


**Note:** No if-else, switch will be used.

**Create AccountTest() class to test the Account:**

```
public class AccountTest {
	public static void main (String[] args) {

		Account myAccount = new Account("1234", 10000.0); //set acct to active state
        myAccount.activate(); // displays "Account is already activated!"

        //Suspend the account
		myAccount.suspend(); //displays "Account is suspended!"

		//Activate the account
        myAccount.activate(); //displays "Account is activated!"
		
		//Deposit to the account
	    myAccount.deposit(1000.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().    	                                

        //Withdraw to the account
        myAccount.withdraw(100.0);// update balance and displays account number and
        // current balance. Call the toString() method in withdraw().    	                                

        //Close the account()
        myAccount.close();  //displays "Account is closed!"

        //Activate the account
        myAccount.activate();    // Displays "You cannot activate a closed account!"	

        //Suspend the account
        myAccount.suspend(); // Displays " You cannot suspend a closed account!"


        //Withdraw to the account
        myAccount.withdraw(500.0);// Show message "You cannot withdraw on a closed                   account!". Call the toString() to show current balance and account number.

        //Deposit to the account
        myAccount.deposit(1000.0);// Show message "You cannot deposit on closed                  //account!". Call the toString() to show current balance and account number.
    }
}
```

