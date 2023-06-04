package behavioral.state.simple;

public class ConcreteStateB implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Выполняю действие состояния B");
        context.setState(new ConcreteStateA());
    }
}
