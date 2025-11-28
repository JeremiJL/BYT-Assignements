package byt.observer;

public class ConcreteObserver implements IObserver {

    protected final String userName;

    public ConcreteObserver(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String availability) {
        System.out.println("Update for : " + userName + ". Changed availability: " + availability + ".");
    }

    public void addSubscriber(ISubject subject) {
        subject.registerObserver(this);
    }
    public void removeSubscriber(ISubject subject) {
        subject.removeObserver(this);
    }
}
