# Music Visualiser Assigment

Name: Andrew Murphy

Student Number: C19342421

# What your assignment does
This assignment was to create Music Visuals for a song of our choice.
I decided it would be a good idea to team up with another class mate to create
a song together because we both love music production. So we both contributed
to making the song and then make our own visuals for that song.

# What are the controls
A) To start the program, hit the 'Space' key, and the song will play
B) To return to the beginning of the song, hit the 'z' key
C) There are 4 options to choose from ranging from 1-4 on the keyboard

# How to make it run
The PApplet was used extensively throughout this assignment. It uses the
processing core to use certain methods like setup() and draw().

## Sections from the program

- Each of the classes that were used:
'''Java
public class MyVisual extends Visual 
{
    Design1 dsn1;
    Design2 dsn2;
    Design3 dsn3;
    Design4 dsn4;
}
'''

- An example of where a constructor was used:
'''Java
public Flags (MyVisual dsn2)
{
	this.dsn2 = dsn2;
}
'''

- The setup() method that was used:
'''Java
public void setup()
{
    frameRate(60);

    startMinim();

    // Function to call audio file
    loadAudio("java_project.mp3");

    // Constructors for each of the visuals
    dsn1 = new Design1(this);
    dsn2 = new Design2(this);
    dsn3 = new Design3(this);
    dsn4 = new Design4(this);
}
'''
- What I am most proud of:
'''Java
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
'''