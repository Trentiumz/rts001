package main;

import processing.core.PApplet;

public class Main extends PApplet {
    public static Main client = null;
    State curState;

    public Main() {
        if (client != null)
            throw new RuntimeException("A second client was created when it should've been a singleton!");
        client = this;
    }

    public void settings() {
        size(1000, 800);
    }

    public void setup() {
        frameRate(30);
        curState = new StartingState();
        curState.setup();
    }

    public void draw() {
        curState.tick();
        curState.render();
    }

    public void mousePressed() {
        curState.mousePressed();
    }

    public void mouseReleased() {
        curState.mouseReleased();
    }

    public void keyPressed() {
        curState.keyPressed();
    }

    public void keyReleased() {
        curState.keyReleased();
    }

    public void changeState(State changeTo) {
        this.curState = changeTo;
    }

    public static void main(String[] args) {
        PApplet.main(new String[]{"main.Main"});
    }
}
