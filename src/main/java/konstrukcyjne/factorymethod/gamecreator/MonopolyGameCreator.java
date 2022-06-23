package konstrukcyjne.factorymethod.gamecreator;

import konstrukcyjne.factorymethod.game.BoardGame;
import konstrukcyjne.factorymethod.interfejs.Game;
import konstrukcyjne.factorymethod.interfejs.GameFactory;

public class MonopolyGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new BoardGame("Monopoly", "Family Game", 4);
    }
}
