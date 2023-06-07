package behavioral.observer.simple2;

public class YouTubeUser implements Subscriber {
    @Override
    public void showNotification(String text) {
        System.out.println("Вышло новое видео: " + text);
    }
}
