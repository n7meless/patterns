package behavioral.state.simple;

public class Main {
    /*Состояние - позволяет объекту варьировать свое поведение
    при изменении внутреннего состояния. При этом создается впечатление,
    что поменялся класс объекта*/

    /*Можно обновлять состояние как с клиентского когда (Main) так
     и с конкретных состояний, в данном примере состояния
     переключаются не из клиентского кода*/

    public static void main(String[] args) {
        State stateA = new ConcreteStateA();

        Context context = new Context(stateA);

        context.doAction();
        context.doAction();

    }
}
