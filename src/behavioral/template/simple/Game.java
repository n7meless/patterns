package behavioral.template.simple;

public abstract class Game {
    public final void play(){
        initialize();
        startGame();
        endGame();
    }
    protected abstract void initialize();
    protected abstract void startGame();
    protected void endGame(){
        System.out.println("Игра окончена");
    };

}
