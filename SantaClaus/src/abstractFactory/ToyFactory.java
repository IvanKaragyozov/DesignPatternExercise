package abstractFactory;

public class ToyFactory extends AbstractFactory{


    @Override
    public Toy createToy(String toyName) {

        if(toyName.equals("Bike")){
            return new Bike();
        } else if(toyName.equals("Doll")){
            return new Doll();
        }

        System.out.println("Unknown Toy");
        return null;
    }
}
