package behavioral.visitor.simple2;


public class ShoppingCartClient {
    /*
    * Шаблон посетителя используется, когда нам нужно выполнить операцию
    * над группой похожих объектов. С помощью паттерна посетитель мы можем
    * перенести операционную логику из объектов в другой класс. Например,
    * подумайте о корзине для покупок, куда мы можем добавлять различные
    * типы товаров (элементы). Когда мы нажимаем кнопку «Оформить заказ»,
    * он вычисляет общую сумму к оплате. Теперь у нас может быть логика расчета
    *  в классах элементов или мы можем перенести эту логику в другой класс,
    * используя шаблон посетителя. Давайте реализуем это в нашем
    * примере шаблона посетителя.

     */

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}