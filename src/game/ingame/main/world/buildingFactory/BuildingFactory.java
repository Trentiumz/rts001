package game.ingame.main.world.buildingFactory;

import game.ingame.main.User;
import game.ingame.main.world.World;

public abstract class BuildingFactory {
    protected World world;
    protected User user;

    BuildingFactory(World world, User user){
        this.world = world;
        this.user = user;
    }

    public abstract boolean canPlaceBuilding(float x, float y);
    public abstract void placeBuilding(float x, float y);
    public abstract void drawBlueprint(float x, float y);
}
