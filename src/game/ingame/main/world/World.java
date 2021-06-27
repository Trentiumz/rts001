package game.ingame.main.world;

import game.ingame.main.world.tile.Tile;
import main.Main;
import main.Proxy;

import java.util.HashSet;

public class World {

    public static final int gridSize = 50;
    Camera curCamera;
    HashSet<GameObject> objects;
    /**
     * Mapping of the tiles; tilemap[x][y] = Tile at (x, y)
     */
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

    public float mouseX() {
        return curCamera.realX(Proxy.mouseX());
    }

    public float mouseY() {
        return curCamera.realY(Proxy.mouseY());
    }

    public boolean touchingGameObject(float x, float y, float w, float h) {
        for (GameObject object : objects) {
            if (object.touching(x, y, w, h)) return true;
        }
        return false;
    }

    public boolean touchingWall(float x, float y, float w, float h){
        int sx = (int) x / gridSize;
        int sy = (int) y / gridSize;
        int ex = (int) (x + w) / gridSize;
        int ey = (int) (y + h) / gridSize;
        for(int cx = sx; cx <= ex; ++cx)
            for(int cy = sy; cy <= ey; ++cy){
                if(!tilemap[cx][cy].walkable) return true;
            }
        return false;
    }
}
