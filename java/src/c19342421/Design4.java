package c19342421;

import ie.tudublin.Visual;
import processing.core.*;

public class Design4 extends Visual
{
    float cy = 0;

    MyVisual dsn4;

    public Design4(MyVisual dsn4)
    {
        this.dsn4 = dsn4;
        cy = this.dsn4.height / 2;
    }

    public void render()
    {
        dsn4.colorMode(PApplet.HSB);
        for(int i = 0 ; i < dsn4.getAudioBuffer().size() ; i ++)
        {
            dsn4.stroke(PApplet.map(i, 0, dsn4.getAudioBuffer().size(), 0, 255), 255, 255);

            dsn4.line(i, cy, i, cy + cy * dsn4.getAudioBuffer().get(i));
        }
    }
}