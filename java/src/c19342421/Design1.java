package c19342421;

import ie.tudublin.Visual;
import processing.core.*;

public class Design1 extends Visual
{
    MyVisual dsn1;

    public Design1(MyVisual dsn1)
    {
        this.dsn1 = dsn1;
    }

    public void render()
    {
        dsn1.colorMode(PApplet.HSB);

        float gap = dsn1.width / (float) dsn1.getBands().length;

        for(int i = 0 ; i < dsn1.getBands().length ; i ++)
        {
            dsn1.fill(PApplet.map(i, 0, dsn1.getBands().length, 255, 0), 255, 255);
            dsn1.rect(i * gap, dsn1.height, gap,-dsn1.getSmoothedBands()[i] * 1.0f); 
        }      
             
    }        
}