package behavioral.state.simple;

public class ConcreteStateA implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Выполняю действие состояния А");
        context.setState(new ConcreteStateB());
    }
}
