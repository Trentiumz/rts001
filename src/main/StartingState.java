package main;

import mainMenu.MainMenu;

public class StartingState extends State {
    @Override
    public void setup() {
        Main.client.changeState(new MainMenu());
    }

    @Override
    public void tick() {

    }

    @Override
    public void render() {

    }
}
