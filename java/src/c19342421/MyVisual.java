package c19342421;

import ie.tudublin.*;

public class MyVisual extends Visual 
{
    // Classes that are used for the different visuals
    Design1 dsn1;
    Design2 dsn2;
    Design3 dsn3;
    Design4 dsn4;

    // Used for choosing which visual to view
    int value = 0;

    public void settings()
    {
        size(1024, 950, P3D);
    }

    public void setup()
    {
        frameRate(75);

        startMinim();

        // Function to call audio file
        loadAudio("java_project.mp3");

        // Instances for each of the classes
        dsn1 = new Design1(this);
        dsn2 = new Design2(this);
        dsn3 = new Design3(this);
        dsn4 = new Design4(this);
    }

    // Switch statement to assign each number a visual
    public void keyPressed()
    {
        switch (key)
        {
            case '1':
            {
                value = 1;
                break;
            }
            case '2':
            {
                value = 2;
                break;
            }
            case '3':
            {
                value = 3;
                break;
            }
            case '4':
            {
                value = 4;
                break;
            }
        }
    

        // If statement to pause music if space bar is pressed
        if(key == ' ')
        {
            if(getAudioPlayer().isPlaying() == true)
            {
                getAudioPlayer().pause();
            }
            else
            {
                getAudioPlayer().play();
            }
        }

        // If statement to return to beginning of song
        if(key == 'z')
        {
            getAudioPlayer().rewind();
        }
    }

    // Method used to call the visuals
    public void draw()
    {
        background(0);

        try
        {
            calculateFFT();

            if(getAudioPlayer().isPlaying() == false)
            {
                dsn1.render();
            }
            
            // Calls the visual by it's associated number

            switch(value)
            {
                case 0:
                {
                    break;
                }
                case 1:
                {
                    dsn1.render();
                    break;
                }
                case 2:
                {
                    dsn2.render();
                    break;
                }
                case 3:
                {
                    dsn3.render();
                    break;
                }
                case 4:
                {
                    dsn4.render();
                    break;
                }
            }
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }

        // Call this is you want to use frequency bands
        calculateFrequencyBands();

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();
    }
}