package game.ingame.main.states;

import game.ingame.GameState;

import static main.Main.client;

public class DefaultState extends GameState {
    @Override
    public void setup() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render() {
        client.background(255, 255, 255);
        client.fill(255, 0, 0, 255);
        client.stroke(0, 0, 255, 255);
        client.strokeWeight(3);
        client.rect(200, 200, 200, 200);
    }
}
