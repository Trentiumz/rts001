package mainMenu;

import main.Main;
import static main.Main.client;
import processing.core.PFont;
import tool.Color;

public class TechButton extends Button {
    int curFrame;
    public static final int maxFrames = 10;
    public static final float hoveredBufferRatio = 0.15f;

    static final int background = client.color(0, 200, 255);
    static final int stroke = client.color(0, 0, 255);
    static final int textColor = client.color(0, 0, 0);
    static final int foreSlot = client.color(255, 0, 0);
    static final int line = client.color(255, 0, 0);

    private static PFont textFont;
    int textSize;

    protected TechButton(int x, int y, int w, int h, String text, int textSize) {
        super(x, y, w, h, text);
        curFrame = 0;
        if (textFont == null)
            textFont = client.loadFont("H2sa1M-48.vlw");
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
        client.fill(background);
        client.stroke(stroke);
        client.strokeWeight(5);
        client.rect(x, y, w, h);
        client.textAlign(Main.CENTER, Main.CENTER);

        client.stroke(line);
        client.strokeWeight(2);
        float lineY = y + (float) curFrame / maxFrames * h;
        client.line(x, lineY, x + w, lineY);

        client.fill(foreSlot);
        client.stroke(stroke);
        client.strokeWeight(5);
        float bufferLength = curFrame * hoveredBufferRatio / maxFrames * w;

        client.beginShape();
        client.vertex(x, y);
        client.vertex(x + bufferLength, y);
        client.vertex(x + bufferLength + h / 2, y + h / 2);
        client.vertex(x + bufferLength, y + h);
        client.vertex(x, y + h);
        client.endShape();
        client.beginShape();
        client.vertex(x + w, y);
        client.vertex(x + w - bufferLength, y);
        client.vertex(x + w - bufferLength - h / 2, y + h / 2);
        client.vertex(x + w - bufferLength, y + h);
        client.vertex(x + w, y + h);
        client.endShape();

        client.textFont(textFont);
        client.textSize(textSize);
        client.fill(textColor);
        client.text(toDisplay, x + w / 2, y + h / 2);
    }
}
