package main;

public abstract class State {

    public State() {
        setup();
    }

    public abstract void setup();

    public abstract void tick();

    public abstract void render();

    public void mousePressed() {

    }

    public void mouseReleased() {

    }

    public void keyPressed() {

    }

    public void keyReleased() {

    }

    public float mouseX() {
        return Main.client.mouseX;
    }

    public float mouseY() {
        return Main.client.mouseY;
    }

    public char key() {
        return Main.client.key;
    }

    public int keyCode() {
        return Main.client.keyCode;
    }

}
