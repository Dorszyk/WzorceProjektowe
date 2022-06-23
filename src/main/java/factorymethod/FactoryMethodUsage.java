package factorymethod;

import factorymethod.gamecreator.MonopolyGameCreator;
import factorymethod.gamecreator.ValorantGameCreator;
import factorymethod.interfejs.Game;
import factorymethod.interfejs.GameFactory;

import java.util.Scanner;

public class FactoryMethodUsage {
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        final String type = keyboard.nextLine();
        GameFactory gameFactory;
        if (type.equals("PC")) {
            gameFactory = new ValorantGameCreator();
        } else if (type.equals("Board")){
            gameFactory = new MonopolyGameCreator();
        } else {
            throw new RuntimeException("unknown game type");
        }
        Game createdGame = gameFactory.create();
        System.out.println("Created game " + createdGame);
    }
}
