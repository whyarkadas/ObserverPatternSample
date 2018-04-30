public class Main {

    public static void main(String[] args){

        Subject subject = new Subject();

        System.out.println("Observer Pattern Test Started :");

        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();

        subject.registerObserver(observerA);

        System.out.println("# Observer A is registered");

        subject.registerObserver(observerB);

        System.out.println("# Observer B is registered");

        subject.notifyObservers();

        subject.unregisterObserver(observerA);

        System.out.println("# Observer A is unregistered");

        subject.notifyObservers();

    }
}
