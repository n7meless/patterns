package behavioral.observer.simple2;

public class Main {
    /*Наблюдать - создает механизм подписки,
    позволяющий одним обьектам следить и реагировать
    на события, происходящие в других объектах*/
    public static void main(String[] args) {
        YouTubeChanel youTubeChanel = new YouTubeChanel();
        YouTubeUser user1 = new YouTubeUser();
        YouTubeUser user2 = new YouTubeUser();
        YouTubeUser user3 = new YouTubeUser();

        youTubeChanel.addSubscriber(user1);
        youTubeChanel.addSubscriber(user2);
        youTubeChanel.addSubscriber(user3);

        youTubeChanel.uploadNewVideo("Как реализовать паттерн наблюдатель?");
    }
}
