package worldBuilder.tiles;

public class Grass extends Tile{
    public Grass(int x, int y) {
        super(x, y);
    }

    @Override
    public String getStringRepresentation() {
        return "G";
    }

    @Override
    public void render() {

    }
}
