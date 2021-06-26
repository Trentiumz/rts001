package game.ingame.main.world.tile;

public abstract class Tile {
    public final int x, y;
    public final boolean walkable;
    public Tile(int x, int y, boolean walkable){
        this.x = x;
        this.y = y;
        this.walkable = walkable;
    }

    public abstract void tick();
    public abstract void render();
}
