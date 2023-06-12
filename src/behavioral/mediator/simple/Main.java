package behavioral.mediator.simple;

public class Main {
    /*Посредник - это паттерн проектирования,
    который позволяет уменьшить связанность множества классов между собой,
    благодаря перемещению этих связей в один класс-посредник.*/
    public static void main(String[] args) {
        BankMediator mediator = new BankSystemCustomMediator();

        BankUser user1 = new BankUser("Ivan", mediator);
        BankUser user2 = new BankUser("Kate", mediator);
        BankUser user3 = new BankUser("Mary", mediator);

        user1.applyForLoan();
        user1.createAccount();

        user2.applyForLoan();
        user2.createAccount();

        user3.applyForLoan();
        user3.createAccount();
    }
}
