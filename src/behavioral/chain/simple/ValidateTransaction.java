package behavioral.chain.simple;

public abstract class ValidateTransaction {
    private ValidateTransaction next;

    public void setNext(ValidateTransaction next) {
        this.next = next;
    }

    protected void checkNext(MoneyTransaction transaction) {
        if (next != null) {
            next.check(transaction);
        }
    }

    public abstract void check(MoneyTransaction transaction);
}
