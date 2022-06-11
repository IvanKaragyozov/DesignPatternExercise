package command;

import abstractFactory.Toy;

public class CreateToy implements Command{

    private Toy toy;

    public CreateToy(Toy toy){
        this.toy = toy;
    }

    @Override
    public String execute() {
        this.toy.create();
        return toy.getClass().getSimpleName();
    }

}
