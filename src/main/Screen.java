package main;

import processing.core.PImage;

public class Screen {

    /**
     * draws an image
     *
     * @param image the image to draw
     * @param x     the x coordinate of the image
     * @param y     the y coordinate of the image
     */
    public static void image(PImage image, int x, int y) {
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
    public static void fill(int r, int g, int b, int a) {
        Main.getClient().fill(r, g, b, a);
    }

    /**
     * sets the stroke color
     *
     * @param r r value of color
     * @param g g value of color
     * @param b b value of color
     * @param a a value of color
     */
    public static void stroke(int r, int g, int b, int a) {
        Main.getClient().stroke(r, g, b, a);
    }

    /**
     * sets the stroke weight
     *
     * @param weight the weight
     */
    public static void strokeWeight(float weight) {
        Main.getClient().stroke(weight);
    }

    /**
     * draw a rectangle depending on the rect mode
     */
    public static void rect(int a, int b, int c, int d) {
        Main.getClient().rect(a, b, c, d);
    }

    /**
     * sets the background
     */
    public static void background(int r, int g, int b){
        Main.getClient().background(r, g, b);
    }

    /**
     * @return the width of the screen
     */
    public static int width(){
        return Main.getClient().width;
    }

    /**
     * @return the height of the screen
     */
    public static int height(){
        return Main.getClient().height;
    }

    /**
     * @return the x value of the coordinate of the mouse
     */
    public static int mouseX(){
        return Main.getClient().mouseX;
    }

    /**
     * @return the y value of the coordinate of the mouse
     */
    public static int mouseY(){
        return Main.getClient().mouseY;
    }
}
