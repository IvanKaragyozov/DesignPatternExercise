package singleton;

import observer.MagicBoard;

public class SantaClaus {

    /**
     * There can be only one Santa Claus
     */

    private static SantaClaus instance;

    private MagicBoard magicBoard = new MagicBoard();

    public MagicBoard getMagicBoard() {
        return magicBoard;
    }

    private SantaClaus(){}

    public static SantaClaus getInstance() {

        if(instance == null){
            instance = new SantaClaus();
        }
        return instance;
    }
}
