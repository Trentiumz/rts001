package game.ingame.main.states;

import game.ingame.GameState;
import main.Screen;

public class DefaultState extends GameState {
    @Override
    public void setup() {

    }

    @Override
    public void tick() {

    }

    @Override
    public void render() {
        Screen.background(255, 255, 255);
        Screen.fill(255, 0, 0, 255);
        Screen.stroke(0, 0, 255, 255);
        Screen.strokeWeight(3);
        Screen.rect(200, 200, 200, 200);
    }
}
