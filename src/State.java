import main.Main;

public abstract class State {

    public State(){
        setup();
    }

    public abstract void setup();

    public abstract void tick();

    public abstract void render();

    public void mousePressed(){

    }

    public void mouseReleased(){

    }

    public void keyPressed(){

    }

    public void keyReleased(){

    }

    public float mouseX(){
        return Main.getClient().mouseX;
    }

    public float mouseY(){
        return Main.getClient().mouseY;
    }

    public char key(){
        return Main.getClient().key;
    }

    public int keyCode(){
        return Main.getClient().keyCode;
    }

}
