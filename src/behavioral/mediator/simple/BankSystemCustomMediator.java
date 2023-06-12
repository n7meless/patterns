package behavioral.mediator.simple;

public class BankSystemCustomMediator implements BankMediator{
    @Override
    public void createAccount(BankUser user) {
        System.out.println(user.getName() +
                " Новая логика запросв в разные системы для создания аккаунта");
    }

    @Override
    public void applyForLoan(BankUser user) {
        System.out.println(user.getName() +
                " Новая логика запросв в разные системы для заявки на кредит");
    }
}
