package game.ingame.main.world;

import game.ingame.main.world.tile.Tile;
import main.Main;

import java.util.HashSet;

public class World {

    public static final int gridSize = 50;
    Camera curCamera;
    HashSet<GameObject> objects;
    Tile[][] tilemap;

    World() {
        curCamera = new Camera();
        objects = new HashSet<>();
    }

    void tick() {
        for (GameObject object : objects) object.tick();
    }

    void render() {
        Main.getClient().pushMatrix();
        curCamera.alterMatrix();
        for (GameObject object : objects) object.render();
        Main.getClient().popMatrix();
    }

}
