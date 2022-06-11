package observer;

import abstractFactory.Toy;
import command.Command;

public interface Observer {

    Toy update(Command command);
    void setTopic(Observable topic);

}
