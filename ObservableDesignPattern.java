import java.util.ArrayList;

interface IObservable {
    void addObserver(IObserver ob);
    void removeObserver(IObserver ob);
    void notifyObservers(); 
}
class Observable implements IObservable {
    private ArrayList<IObserver> observers = new ArrayList<>();
    String name;
    public Observable(String name) {
        this.name = name;
    }
    @Override
    public void addObserver(IObserver ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(IObserver ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (IObserver ob : observers) {
            ob.update();
        }
    }
}
interface IObserver {
    void update();
}
class Observer implements IObserver {
    private String name;
    IObservable observable;

    public Observer(String name, IObservable observable) {
        this.name = name;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Observer " + name + " has been notified.");
    }
}
public class ObservableDesignPattern {
    public static void main(String[] args) {
        Observable observable = new Observable("Subject1");

        Observer observer1 = new Observer("Observer1", observable);
        Observer observer2 = new Observer("Observer2", observable);

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        System.out.println("Notifying observers...");
        observable.notifyObservers();

        observable.removeObserver(observer1);

        System.out.println("Notifying observers after removing Observer1...");
        observable.notifyObservers();
    }
}
