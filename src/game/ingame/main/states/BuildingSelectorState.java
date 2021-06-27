package game.ingame.main.states;

import game.ingame.GameState;
import game.ingame.main.world.World;
import game.ingame.main.world.buildingFactory.BuildingFactory;

public class BuildingSelectorState extends GameState {

    protected BuildingFactory factory;
    World world;

    BuildingSelectorState(BuildingFactory factory, World world) {
        this.factory = factory;
        this.world = world;
    }

    @Override
    public void setup() {
    }

    @Override
    public void tick() {
    }

    @Override
    public void render() {
        factory.drawBlueprint(world.mouseX(), world.mouseY());
    }

    @Override
    public void mousePressed() {
        if (factory.canPlaceBuilding(world.mouseX(), world.mouseY())) {
            factory.placeBuilding(world.mouseX(), world.mouseY());
        }
    }
}
