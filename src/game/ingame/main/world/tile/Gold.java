package game.ingame.main.world.tile;

public class Gold extends Tile implements Mineable{
    int gold;
    public static final int goldPerQuery = 50;

    public Gold(int x, int y, int amtGold) {
        super(x, y, true);
        this.gold = amtGold;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render() {

    }

    @Override
    public int mine() {
        int toTake = Math.min(goldPerQuery, gold);
        gold -= toTake;
        return toTake;
    }
}
