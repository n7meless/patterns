package behavioral.template;

public class Main {
    /*Шаблонный метод - определеяет скелет алгоритма,
    перекладывая ответственность за некоторые его шаги на подклассы.
    Паттерн позволяет подклассам переопределять шаги алгоритма,
    не меняя его общей структуры..*/
    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        footballGame.play();

        System.out.println("----------------------");

        Game chessGame = new ChessGame();
        chessGame.play();
    }
}
