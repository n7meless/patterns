package behavioral.strategy.simple2;

public class ShoppingCartTest {

    /*Шаблон стратегии также известен как шаблон политики.
    Мы определяем несколько алгоритмов и позволяем клиентскому
    приложению передавать алгоритм для использования в качестве
    параметра. Одним из лучших примеров шаблона стратегии является
    Collections.sort()метод, который принимает параметр Comparator.
    В зависимости от различных реализаций интерфейсов Comparator
    объекты сортируются по-разному. В нашем примере мы попробуем
    реализовать простую корзину покупок, в которой у нас есть две
    стратегии оплаты — с помощью кредитной карты или с помощью PayPal.
    Прежде всего, мы создадим интерфейс для нашего примера шаблона
    стратегии, в нашем случае для оплаты суммы, переданной в качестве
    аргумента.PaymentStrategy.java
    * */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
