package factorymethod.gamecreator;

import factorymethod.game.PCGame;
import factorymethod.interfejs.Game;
import factorymethod.interfejs.GameFactory;

public class ValorantGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new PCGame("Valorant", "FPS", 4, 10, true);
    }
}

