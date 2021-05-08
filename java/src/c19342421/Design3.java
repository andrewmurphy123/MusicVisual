package c19342421;

import ie.tudublin.Visual;
import processing.core.*;

public class Design3 extends Visual
{
    MyVisual dsn3;

    public Design3(MyVisual dsn3)
    {
        this.dsn3 = dsn3;
    }

    public void render()
    {
        dsn3.translate(width * 5, height * 5);
        dsn3.colorMode(PApplet.HSB);

        for(int i = 0; i < 255; i++)
        {
            float a = map(i, 0, 255, 0, 255);
            dsn3.noStroke();
            dsn3.fill(a, 255, 255);
            dsn3.rotate(radians(-20));
            dsn3.ellipse(width * 4, getSmoothedAmplitude() * 200, ab.get(i) * 200, ab.get(i) * height);
            dsn3.triangle(ab.get(i) * lerpedAverage, ab.get(i) * 50, ab.get(i) * 500, 40, ab.get(i) * lerpedAverage, ab.get(i) * 40);
        }
    }
}