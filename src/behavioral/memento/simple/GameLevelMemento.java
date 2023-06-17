package behavioral.memento.simple;

public class GameLevelMemento {
    private final int levelNumber;
    private final int score;
    private final String checkpoint;

    public GameLevelMemento(int levelNumber, int score, String checkpoint) {
        this.levelNumber = levelNumber;
        this.score = score;
        this.checkpoint = checkpoint;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getScore() {
        return score;
    }

    public String getCheckpoint() {
        return checkpoint;
    }
}
