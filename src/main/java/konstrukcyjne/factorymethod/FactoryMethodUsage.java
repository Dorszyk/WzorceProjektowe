package konstrukcyjne.factorymethod;

import konstrukcyjne.factorymethod.gamecreator.MonopolyGameCreator;
import konstrukcyjne.factorymethod.gamecreator.ValorantGameCreator;
import konstrukcyjne.factorymethod.interfejs.Game;
import konstrukcyjne.factorymethod.interfejs.GameFactory;

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
