package factorymethod.gamecreator;

import factorymethod.game.BoardGame;
import factorymethod.interfejs.Game;
import factorymethod.interfejs.GameFactory;

public class MonopolyGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new BoardGame("Monopoly", "Family Game", 4);
    }
}
