package mainMenu;

import static main.Main.client;
import main.State;

public class MainMenu extends State {
    TechButton start;

    @Override
    public void setup() {
        start = new TechButton(client.width / 2 - 100, client.height / 2 - 30, 200, 60, "Start", 40);
    }

    @Override
    public void tick() {
        start.tick();
    }

    @Override
    public void render() {
        start.render();
    }

    public void mousePressed(){
        if(start.mouseOn()){
            System.out.println("starting game");
        }
    }
}
