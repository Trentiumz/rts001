package worldBuilder;

import static main.Main.client;
import worldBuilder.tileSidebar.TileSidebar;

public class Sidebar {
    TileSidebar tileSidebar;

    class TileIcon {
        TileSidebar setTileSidebar;
        float x, y, w, h;

        TileIcon(float x, float y, float w, float h) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        void mousePressed() {
            if (x < client.mouseX && client.mouseX < x + w &&
                    y < client.mouseY && client.mouseY < y + h) tileSidebar = setTileSidebar;
        }
    }
}
