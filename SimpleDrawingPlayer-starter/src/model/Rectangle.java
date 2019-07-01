package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        PLAYING_COLOR = new Color(230, 158, 60);
    }

    // EFFECTS: return true if the given Point (x,y) is contained within the bounds of this Shape
    @Override
    public boolean contains(Point point) {
        int point_x = point.x;
        int point_y = point.y;

        return containsX(point_x) && containsY(point_y);
    }

    //EFFECTS: draws the shape
    @Override
    protected void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    //EFFECTS: fills the shape
    @Override
    protected void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }

    // EFFECTS: starts playing this Shape, where sound is dependent on the area/coordinates of the Shape
    @Override
    protected void play(){
        int volume = areaToVelocity(width * height);
        midiSynth.play(instrument, coordToNote(y), volume);
    }
}
