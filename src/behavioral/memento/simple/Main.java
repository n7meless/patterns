package behavioral.memento.simple;

public class Main {
    /*Снимок - позволяет сохранять состояние объекта
     * и восстанавливать его в будущем,
     * не раскрывая деталей реализации объекта*/
    public static void main(String[] args) {
        GameLevel gameLevel = new GameLevel();
        GameHistory gameHistory = new GameHistory();

        gameLevel.setLevelNumber(1);
        gameLevel.setScore(100);
        gameLevel.setCheckpoint("Level 1, Checkpoint 1");
        gameLevel.play();

        gameHistory.add(gameLevel.save());

        gameLevel.setLevelNumber(2);
        gameLevel.setScore(200);
        gameLevel.setCheckpoint("Level 2, Checkpoint 1");
        gameLevel.play();

        gameHistory.add(gameLevel.save());

        gameLevel.restore(gameHistory.get(0));
        System.out.println("Level: " + gameLevel.getLevelNumber());
    }
}
