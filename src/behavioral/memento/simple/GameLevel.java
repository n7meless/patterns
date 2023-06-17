package behavioral.memento.simple;

public class GameLevel {
    private int levelNumber;
    private int score;
    private String checkpoint;

    public GameLevel() {
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public GameLevel(int levelNumber, int score, String checkpoint) {
        this.levelNumber = levelNumber;
        this.score = score;
        this.checkpoint = checkpoint;
    }

    public GameLevelMemento save(){
        return new GameLevelMemento(levelNumber, score, checkpoint);
    }
    public void restore(GameLevelMemento memento){
        levelNumber = memento.getLevelNumber();
        score = memento.getScore();
        checkpoint = memento.getCheckpoint();
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public int getScare() {
        return score;
    }

    public String getCheckpoint() {
        return checkpoint;
    }
    public void play(){

    }
}
