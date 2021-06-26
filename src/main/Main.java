package main;

import processing.core.PApplet;

public class Main extends PApplet {
    private static Main client = null;

    public Main() {
        if(client != null)
            throw new RuntimeException("A second client was created when it should've been a singleton!");
        client = this;
    }

    public Main main() {
        if (client == null)
            client = new Main();
        return client;
    }

    public void settings() {
        size(1000, 800);
    }

    public void setup() {

    }

    public void mousePressed() {
    }

    public void mouseReleased() {
    }

    public static void main(String[] args) {
        PApplet.main(new String[]{"main.Main"});
    }

    public static Main getClient(){
        return client;
    }
}
