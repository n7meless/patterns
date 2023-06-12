package behavioral.mediator.simple;

public interface BankMediator {
    void createAccount(BankUser user);
    void applyForLoan(BankUser user);
}
