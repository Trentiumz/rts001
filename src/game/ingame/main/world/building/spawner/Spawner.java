package game.ingame.main.world.building.spawner;

import game.ingame.main.world.building.Building;

public abstract class Spawner extends Building {
    public Spawner(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
}
