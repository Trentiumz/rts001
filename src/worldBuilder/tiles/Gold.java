package worldBuilder.tiles;

import processing.core.PImage;
import tool.Assets;
import worldBuilder.World;

import static main.Main.client;

public class Gold extends Tile {
    int amtGold;
    PImage tile;

    public Gold(int x, int y, int amtGold) {
        super(x, y);
        this.amtGold = amtGold;
        tile = Assets.goldTile;
    }

    @Override
    public String getStringRepresentation() {
        return "G" + ":" + amtGold;
    }

    @Override
    public void render() {
        client.image(tile, World.gridSize * x, World.gridSize * y);
    }
}
