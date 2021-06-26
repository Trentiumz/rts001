package game.ingame.main.world;

import main.Main;
import processing.core.PImage;
import tool.Tools;

public abstract class Entity {

    private int x, y, w, h;

    public Entity(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public boolean collided(Entity other) {
        return Tools.boxCollided(x, y, w, h, other.x, other.y, other.w, other.h);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected void setW(int w) {
        this.w = w;
    }

    protected void setH(int h) {
        this.h = h;
    }
}
