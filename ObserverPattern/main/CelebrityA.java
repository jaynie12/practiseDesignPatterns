package ObserverPattern.main;

import java.util.ArrayList;
import java.util.List;

public class CelebrityA implements InstagramObserver {

    List<UserObserver> observerList = new ArrayList<>();
    Post post;

    public CelebrityA(Post post) {
        this.post = post;
    }

    @Override
    public void addObserver(UserObserver userObserver) {
        observerList.add(userObserver);
    }

    @Override
    public void removeObserver(UserObserver userObserver) {
        observerList.remove(userObserver);
    }

    @Override
    public void notifyObserver() {
        for (UserObserver userObserver : observerList) {
            userObserver.updateFeed(post);
        }
    }

}
