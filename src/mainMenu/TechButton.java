package mainMenu;

import main.Main;
import main.Proxy;
import processing.core.PFont;
import tool.Color;

public class TechButton extends Button {
    int curFrame;
    public static final int maxFrames = 10;
    public static final float hoveredBufferRatio = 0.15f;

    static final Color background = new Color(0, 200, 255);
    static final Color stroke = new Color(0, 0, 255);
    static final Color textColor = new Color(0, 0, 0);
    static final Color foreSlot = new Color(255, 0, 0);
    static final Color line = new Color(255, 0, 0);

    private static PFont textFont;
    int textSize;

    protected TechButton(int x, int y, int w, int h, String text, int textSize) {
        super(x, y, w, h, text);
        curFrame = 0;
        if (textFont == null)
            textFont = Proxy.loadFont("H2sa1M-48.vlw");
        this.textSize = textSize;
    }

    @Override
    void tick() {
        if (mouseOn())
            curFrame = Math.min(maxFrames, curFrame + 1);
        else
            curFrame = Math.max(0, curFrame - 1);
    }

    @Override
    void render() {
        Proxy.fill(background);
        Proxy.stroke(stroke);
        Proxy.strokeWeight(5);
        Proxy.rect(x, y, w, h);
        Proxy.textAlign(Main.CENTER, Main.CENTER);

        Proxy.stroke(line);
        Proxy.strokeWeight(2);
        float lineY = y + (float) curFrame / maxFrames * h;
        Proxy.line(x, lineY, x + w, lineY);

        Proxy.fill(foreSlot);
        Proxy.stroke(stroke);
        Proxy.strokeWeight(5);
        float bufferLength = curFrame * hoveredBufferRatio / maxFrames * w;

        Proxy.beginShape();
        Proxy.vertex(x, y);
        Proxy.vertex(x + bufferLength, y);
        Proxy.vertex(x + bufferLength + h / 2, y + h / 2);
        Proxy.vertex(x + bufferLength, y + h);
        Proxy.vertex(x, y + h);
        Proxy.endShape();
        Proxy.beginShape();
        Proxy.vertex(x + w, y);
        Proxy.vertex(x + w - bufferLength, y);
        Proxy.vertex(x + w - bufferLength - h / 2, y + h / 2);
        Proxy.vertex(x + w - bufferLength, y + h);
        Proxy.vertex(x + w, y + h);
        Proxy.endShape();

        Proxy.textFont(textFont);
        Proxy.textSize(textSize);
        Proxy.fill(textColor);
        Proxy.text(toDisplay, x + w / 2, y + h / 2);
    }
}
