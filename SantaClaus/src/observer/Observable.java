package observer;

import abstractFactory.Toy;
import command.Command;

import java.util.List;

public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);

    List<Toy> notifyElves(Command command);
}
