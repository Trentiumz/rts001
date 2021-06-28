package tool;

import processing.core.PImage;
import static main.Main.client;

public class Assets {
    public static PImage grassTile;
    public static PImage goldTile;
    public static PImage rockTile;

    public static void loadImages(){
        loadTiles();
    }

    public static void loadTiles(){
        grassTile = client.loadImage("sprites/tiles/grass.png");
        goldTile = client.loadImage("sprites/tiles/gold.png");
        rockTile = client.loadImage("sprites/tiles/rock.png");
    }
}
