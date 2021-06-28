package worldBuilder;

import tool.Assets;

public class World {
    public static final int gridSize = 50;

    public static void resizeImages(){
        Assets.goldTile.resize(gridSize, gridSize);
        Assets.grassTile.resize(gridSize, gridSize);
        Assets.rockTile.resize(gridSize, gridSize);
    }

}
