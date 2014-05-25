package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Creado por santiago el 25/05/14.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
