package com.john_pank.chapter8.task16;

/**
 * Filosofia_Java
 * Created by John Pank on 28.02.2016.
 */

class Glyph
{
    void draw()
    {
        System.out.println("Glyph.draw()");
    }
    Glyph()
    {
        System.out.println("Перед вызовом draw()");
        draw();
        System.out.println("После вызова draw()");
    }
}

class RoundGlyph extends Glyph
{
    private int radius = 1;
    RoundGlyph(int r)
    {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw()
    {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5).draw();
    }
}
