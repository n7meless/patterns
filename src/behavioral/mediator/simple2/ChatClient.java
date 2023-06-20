package behavioral.mediator.simple2;

public class ChatClient {
    /*
    * Шаблон проектирования «Посредник» — это один из шаблонов поведенческого проектирования,
    * поэтому он имеет дело с поведением объектов. Шаблон проектирования
    * посредника используется для обеспечения централизованной
    * среды связи между различными объектами в системе.*/
    /*
    * Обеспечивает слабую связь, инкапсулируя способ взаимодействия и связи друг
    * с другом разрозненных наборов объектов. Позволяет действиям каждого
    * набора объектов изменяться независимо друг от друга.
     */
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Pankaj");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "Saurabh");
        User user4 = new UserImpl(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");

    }
}
