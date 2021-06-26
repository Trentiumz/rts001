package game.ingame.main.world;

import game.ingame.main.User;

public abstract class GameObject extends Entity implements Damageable {
    User ownedBy;

    public GameObject(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    /**
     * Function for "updating" logic
     */
    public abstract void tick();

    /**
     * Function for drawing onto the screen
     */
    public abstract void render();

    /**
     * @return the owner of this gameObject
     */
    public User getOwnedBy() {
        return ownedBy;
    }
}
