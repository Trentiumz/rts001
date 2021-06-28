package mainMenu;

import static main.Main.client;

abstract class Button {
    float x, y, w, h;

    String toDisplay;

    protected Button(float x, float y, float w, float h, String toDisplay) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.toDisplay = toDisplay;
    }

    abstract void tick();
    abstract void render();

    protected boolean mouseOn() {
        return x < client.mouseX && client.mouseX < x + w && y < client.mouseY && client.mouseY < y + h;
    }
}
