package observer;

/**
 * Created by santiago on 25/04/14.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
