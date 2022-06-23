package konstrukcyjne.factorymethod.game;

import konstrukcyjne.factorymethod.interfejs.Game;

public class BoardGame implements Game {

    private final String name;
    private final String type;
    private final int maxPlayersNum;

    public BoardGame(final String name, final String type, final int maxPlayersNum) {
        this.name = name;
        this.type = type;
        this.maxPlayersNum = maxPlayersNum;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return 2;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxPlayersNum;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return false;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", maxPlayersNum=" + maxPlayersNum +
                '}';
    }
}

