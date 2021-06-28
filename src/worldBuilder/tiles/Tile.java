package worldBuilder.tiles;

public abstract class Tile {
    int x, y;
    public Tile(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return the string representation for storing of the current tile
     */
    public abstract String getStringRepresentation();

    /**
     * draws the current tile
     */
    public abstract void render();
}
