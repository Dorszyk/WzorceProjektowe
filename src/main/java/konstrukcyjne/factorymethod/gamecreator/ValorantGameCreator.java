package konstrukcyjne.factorymethod.gamecreator;

import konstrukcyjne.factorymethod.game.PCGame;
import konstrukcyjne.factorymethod.interfejs.Game;
import konstrukcyjne.factorymethod.interfejs.GameFactory;

public class ValorantGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new PCGame("Valorant", "FPS", 4, 10, true);
    }
}

