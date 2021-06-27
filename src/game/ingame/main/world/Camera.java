package game.ingame.main.world;

import main.Main;

public class Camera {

    int x, y;

    Camera() {
        x = 0;
        y = 0;
    }

    void move(int xDiff, int yDiff) {
        x += xDiff;
        y += yDiff;
    }

    void alterMatrix() {
        Main.getClient().translate(-x, -y);
    }

    float realX(float x){
        return x + this.x;
    }

    float realY(float y){
        return y + this.y;
    }
}
