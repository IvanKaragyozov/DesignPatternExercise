package command;

import abstractFactory.Toy;

public class Gift implements Toy{

    /*public void create(){
        System.out.println("Gift are created");
        this.giftsCreated = true;
    }*/
    @Override
    public void create() {
        System.out.println("Gift is created");
    }
}
