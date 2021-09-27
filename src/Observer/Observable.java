package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observers;

    public Observable() {
        observers = new ArrayList<Observer>();
    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notification(){
        for (Observer observer: observers){
            observer.update(this);
        }
    }
}
