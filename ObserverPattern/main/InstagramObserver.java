package ObserverPattern.main;

public interface InstagramObserver {
    public void addObserver(UserObserver userObserver);
    public void removeObserver(UserObserver userObserver);
    public void notifyObserver();
    
}