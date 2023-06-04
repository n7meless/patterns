package behavioral.chain.simple;

public class MinLimit extends ValidateTransaction{
    @Override
    public void check(MoneyTransaction transaction) {
        if (transaction.getAmount() > 1000){
            System.out.println("Необходимо ввести пин-код");
        }

        checkNext(transaction);
    }
}
