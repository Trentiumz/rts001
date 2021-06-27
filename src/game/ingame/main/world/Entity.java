package game.ingame.main.world;

import tool.Tools;

public abstract class Entity {

    private float x, y, w, h;

    public Entity(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public boolean touching(Entity other) {
        return Tools.boxCollided(x, y, w, h, other.x, other.y, other.w, other.h);
    }

    public boolean touching(float x, float y, float w, float h) {
        return Tools.boxCollided(this.x, this.y, this.w, this.h, x, y, w, h);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getW() {
        return w;
    }

    public float getH() {
        return h;
    }

    protected void setX(float x) {
        this.x = x;
    }

    protected void setY(float y) {
        this.y = y;
    }

    protected void setW(float w) {
        this.w = w;
    }

    protected void setH(float h) {
        this.h = h;
    }
}
