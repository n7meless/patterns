package behavioral.chain.simple;

public class MaxLimit extends ValidateTransaction{
    @Override
    public void check(MoneyTransaction transaction) {
        if (transaction.getAmount() > 10000){
            System.out.println("Превышен максимальный размер транзакции");
        }
    }
}
