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

    /**
     * draws an image
     *
     * @param image the image to draw
     * @param x     the x coordinate of the image
     * @param y     the y coordinate of the image
     */
    protected static void image(PImage image, int x, int y) {
        Main.getClient().image(image, x, y);
    }

    /**
     * Sets the fill
     *
     * @param r the r value of the color
     * @param g the g value of the color
     * @param b the b value of the color
     * @param a the a value of the color
     */
    protected static void fill(int r, int g, int b, int a) {
        Main.getClient().fill(r, g, b, a);
    }

    /**
     * sets the stroke color
     * @param r r value of color
     * @param g g value of color
     * @param b b value of color
     * @param a a value of color
     */
    protected static void stroke(int r, int g, int b, int a) {
        Main.getClient().stroke(r, g, b, a);
    }

    /**
     * sets the stroke weight
     * @param weight the weight
     */
    protected static void strokeWeight(float weight){
        Main.getClient().stroke(weight);
    }

    /**
     * draw a rectangle depending on the rect mode
     */
    protected static void rect(int a, int b, int c, int d){
        Main.getClient().rect(a, b, c, d);
    }
}
