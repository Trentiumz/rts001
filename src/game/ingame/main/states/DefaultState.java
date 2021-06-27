package game.ingame.main.states;

import game.ingame.GameState;
import main.Proxy;

public class DefaultState extends GameState {
    @Override
    public void setup() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render() {
        Proxy.background(255, 255, 255);
        Proxy.fill(255, 0, 0, 255);
        Proxy.stroke(0, 0, 255, 255);
        Proxy.strokeWeight(3);
        Proxy.rect(200, 200, 200, 200);
    }
}
