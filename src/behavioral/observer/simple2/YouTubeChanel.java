package behavioral.observer.simple2;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChanel implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<String> videos = new ArrayList<>();
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String text) {
        subscribers.forEach(subscriber -> subscriber.showNotification(text));
    }

    public void uploadNewVideo(String videoTitle){
        videos.add(videoTitle);
        notifySubscriber(videoTitle);
    }
}
