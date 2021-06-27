package main;

import org.jetbrains.annotations.NotNull;
import processing.core.PFont;
import processing.core.PImage;
import tool.Color;

public class Proxy {

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
        Main.getClient().strokeWeight(weight);
    }

    /**
     * draw a rectangle depending on the rect mode
     */
    public static void rect(float a, float b, float c, float d) {
        Main.getClient().rect(a, b, c, d);
    }

    /**
     * sets the background
     */
    public static void background(int r, int g, int b) {
        Main.getClient().background(r, g, b);
    }

    /**
     * @return the width of the screen
     */
    public static int width() {
        return Main.getClient().width;
    }

    /**
     * @return the height of the screen
     */
    public static int height() {
        return Main.getClient().height;
    }

    /**
     * @return the x value of the coordinate of the mouse
     */
    public static int mouseX() {
        return Main.getClient().mouseX;
    }

    /**
     * @return the y value of the coordinate of the mouse
     */
    public static int mouseY() {
        return Main.getClient().mouseY;
    }

    /**
     * Draws a triangle
     *
     * @param x1 x value of first vertex
     * @param y1 y value of first vertex
     * @param x2 x value of second vertex
     * @param y2 y value of second vertex
     * @param x3 x value of third vertex
     * @param y3 y value of third vertex
     */
    public static void triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        Main.getClient().triangle(x1, y1, x2, y2, x3, y3);
    }

    /**
     * Draws text onto the screen
     *
     * @param text the text to display
     * @param x    x value of the top left corner of the text
     * @param y    y value of the top left corner of the text
     */
    public static void text(String text, float x, float y) {
        Main.getClient().text(text, x, y);
    }

    /**
     * Sets the font
     *
     * @param font the font to set to
     */
    public static void textFont(PFont font) {
        Main.getClient().textFont(font);
    }

    /**
     * Creates a font
     *
     * @param fontName the name of the font family
     * @param size     the size of the font
     * @return a PFont object representing the font
     */
    public static PFont createFont(String fontName, int size) {
        return Main.getClient().createFont(fontName, size);
    }

    /**
     * Sets the fill to a color
     *
     * @param color the color to set the fill to
     */
    public static void fill(@NotNull Color color) {
        fill(color.r, color.g, color.b, color.a);
    }

    /**
     * Sets the stroke to a color
     *
     * @param color the color to set the stroke to
     */
    public static void stroke(@NotNull Color color) {
        stroke(color.r, color.g, color.b, color.a);
    }

    /**
     * Set the text align
     *
     * @param alignX horizontal alignment
     * @param alignY vertical alignment
     */
    public static void textAlign(int alignX, int alignY) {
        Main.getClient().textAlign(alignX, alignY);
    }

    /**
     * sets the text align
     *
     * @param alignX horizontal alignment
     */
    public static void textAlign(int alignX) {
        Main.getClient().textAlign(alignX);
    }

    /**
     * loads the font
     *
     * @param name the filename of the font
     * @return the PFont with the data from the file
     */
    public static PFont loadFont(String name) {
        return Main.getClient().loadFont(name);
    }

    /**
     * sets the size of the text
     *
     * @param size the size of the text
     */
    public static void textSize(int size) {
        Main.getClient().textSize(size);
    }

    /**
     * draws a line
     *
     * @param x1 x value of first endpoint
     * @param y1 y value of first endpoint
     * @param x2 x value of second endpoint
     * @param y2 y value of second endpoint
     */
    public static void line(float x1, float y1, float x2, float y2) {
        Main.getClient().line(x1, y1, x2, y2);
    }

    /**
     * begins a shape
     */
    public static void beginShape(){
        Main.getClient().beginShape();
    }

    /**
     * marks a vertex in a shape
     * @param x1 x value of vertex
     * @param y1 y value of vertex
     */
    public static void vertex(float x1, float y1){
        Main.getClient().vertex(x1, y1);
    }

    /**
     * ends a shape
     */
    public static void endShape(){
        Main.getClient().endShape();
    }
}
