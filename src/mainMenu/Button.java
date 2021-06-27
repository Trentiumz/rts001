package mainMenu;

import main.Proxy;

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
        return x < Proxy.mouseX() && Proxy.mouseX() < x + w && y < Proxy.mouseY() && Proxy.mouseY() < y + h;
    }
}
