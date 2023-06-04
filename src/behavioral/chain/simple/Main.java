package behavioral.chain.simple;

public class Main {
    /*Цепочка обязанностей - позволяет передавать запросы последовательно
    по цепочке обработчиков. Каждый последующий обработчик решает может ли
    он обработать запрос сам и стоит ли передавать запрос дальше по цели.
    *
    * Удобство применять когда
    * - Есть более одного обьекта, способного обработать запрос,
    * и необходимый обработчик заранее не известен.
    * - Отправляем одному из обработчиков, не указывая его явно.
    * - Обработчики задаются динамически*/
    public static void main(String[] args) {
        ValidateTransaction firstValidation = new MinLimit();
        ValidateTransaction secondValidation = new MaxLimit();

        firstValidation.setNext(secondValidation);

        firstValidation.check(new MoneyTransaction(12000));
    }
}
