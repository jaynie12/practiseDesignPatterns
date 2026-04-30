package ObserverPattern.main;

public class UserAImpl implements UserObserver {
    private Post post;

    @Override
    public void updateFeed(Post post){
        this.post=post;
    };
    private void display(){
        System.out.println("User post updated with: " + post.getPost());
    }
}
