package structural.decorator.simple;

public class Main {
    /*Декоратор - позволяет динамически добавлять объектам
     новую функциональность, оборачивая их в полезные "обертки"*/

    /*Класс-декоратор должен быть того же типа, что и декорируемый класс,
     реализовывать тот же интерфейс или наследовать тот же базовый класс.

     Декоратор реализует поведение исходного класса при этом не изменяет его,
     а добавляет свое до или после вызова базового посведения

     Это достигается за счет того, что декоратор содержит в себе обьект
     базового класса и вызывает его методы там, где требуется дополнить поведение*/
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification(emailNotification);
        Notification messengerNotification = new MessengerNotification(smsNotification);
        sendNotification(messengerNotification);
    }

    private static void sendNotification(Notification notification) {
        notification.send();
    }
}
