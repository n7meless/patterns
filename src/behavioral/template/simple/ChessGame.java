package behavioral.template.simple;

public class ChessGame extends Game{
    @Override
    protected void initialize() {
        System.out.println("Шахматная игра: инициализация");
    }

    @Override
    protected void startGame() {
        System.out.println("Шахматная игра: начало игры");
    }
}
