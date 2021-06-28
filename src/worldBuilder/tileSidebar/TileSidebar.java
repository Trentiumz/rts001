package worldBuilder.tileSidebar;

import static main.Main.client;

public abstract class TileSidebar {
    public static final int w = 200;
    public static final int h = 400;

    /**
     * draw a sidebar with the top left at (0, 0)
     */
    protected abstract void drawSidebar();

    public void render(){
        client.pushMatrix();
        client.translate(client.width - w, client.height - h);
        drawSidebar();
        client.popMatrix();
    }
}
