package abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName) {

        if(factoryName.equals("ToyFactory")) {
            return new ToyFactory();
        }

        System.out.println("Unknown factory");
        return null;

    }
}
