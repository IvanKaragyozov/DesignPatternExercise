import abstractFactory.*;
import command.CreateToy;
import observer.Observer;
import observer.Elf;
import singleton.SantaClaus;

public class Application {

    public static void main(String[] args) {

        SantaClaus santaClaus = SantaClaus.getInstance();

        Observer elf1 = new Elf("Galiggs");
        Observer elf2 = new Elf("Ebba");
        Observer elf3 = new Elf("Alviss");

        santaClaus.getMagicBoard().subscribe(elf1);
        santaClaus.getMagicBoard().subscribe(elf2);
        santaClaus.getMagicBoard().subscribe(elf3);

        santaClaus.getMagicBoard().notifyElves(new CreateToy(new Bike()));
        santaClaus.getMagicBoard().unsubscribe(elf2);
        santaClaus.getMagicBoard().notifyElves(new CreateToy(new Doll()));

    }
}
