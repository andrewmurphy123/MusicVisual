package c19342421;

import ie.tudublin.Visual;
import processing.core.*;

public class Design2 extends Visual
{
    MyVisual dsn2;

    public Design2(MyVisual dsn2)
    {
        this.dsn2 = dsn2;
    }

    public void render()
    {
        dsn2.translate(width * 5, height * 5);
        dsn2.colorMode(PApplet.HSB);

        for(int i = 0; i < 255; i++)
        {
            float a = map(i, 0, 255, 0, 255);
            dsn2.noStroke();
            dsn2.fill(a, 255, 255);
            dsn2.rotate(radians(20));
            dsn2.ellipse(width * 4, getSmoothedAmplitude() * 200, ab.get(i) * 200, ab.get(i) * height);
            dsn2.triangle(ab.get(i) * lerpedAverage, ab.get(i) * 50, ab.get(i) * 500, 40, ab.get(i) * lerpedAverage, ab.get(i) * 40);
        }
    }
}