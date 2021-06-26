package mainMenu;

import main.Screen;

abstract class Button {
    int x, y, w, h;

    protected Button(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    abstract void tick();
    abstract void render();
    abstract void onPress();

    protected boolean mouseOn() {
        return x < Screen.mouseX() && Screen.mouseX() < x + w && y < Screen.mouseY() && Screen.mouseY() < y + h;
    }
}
