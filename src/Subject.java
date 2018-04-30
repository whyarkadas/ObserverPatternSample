import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerCollection = new ArrayList<Observer>();
    
    public void registerObserver(Observer observer){
        observerCollection.add(observer);
    }
    
    public void unregisterObserver(Observer observer){
        observerCollection.remove(observer);
    }
    
    public void notifyObservers(){

        for (Observer observer:observerCollection) {

            observer.update();
        }
    }
}
