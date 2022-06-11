package observer;

import abstractFactory.Toy;
import abstractFactory.ToyFactory;
import command.Command;

public class Elf implements Observer{

    private String name;
    private Observable topic;
    private ToyFactory factory;

    public Elf(String name){
        this.name = name;
    }

    @Override
    public Toy update(Command command) {
        this.factory = new ToyFactory();
        Toy toy = factory.createToy(command.execute());

        if(this.topic == null){
            System.out.println("No command given.");
            return null;
        }
        System.out.printf("%s created a %s.%n", this.name, toy.getClass().getSimpleName().toLowerCase());
        return toy;
    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }


}
