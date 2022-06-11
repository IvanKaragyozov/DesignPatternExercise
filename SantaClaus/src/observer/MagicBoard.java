package observer;

import abstractFactory.Toy;
import command.Command;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable{

    /**
     * This is the so called "Magic board" that Santa Claus uses to write topics for his elves
     */

    private List<Observer> observers;

    public MagicBoard() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setTopic(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        observer.setTopic(null);
    }

    @Override
    public List<Toy> notifyElves(Command command) {
        List<Toy> toys = new ArrayList<>();
        System.out.printf("Santa Claus ordered %s.%n", command.execute().toLowerCase());
        for(Observer observer: this.observers) {
            toys.add(observer.update(command));
        }
        System.out.println();
        return toys;
    }
}
