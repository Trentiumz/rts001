package worldBuilder.tiles;

public class Wall extends Tile{
    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    public String getStringRepresentation() {
        return "W";
    }

    @Override
    public void render() {

    }
}
