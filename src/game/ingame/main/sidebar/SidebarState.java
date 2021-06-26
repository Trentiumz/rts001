package game.ingame.main.sidebar;

public abstract class SidebarState {
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
}
