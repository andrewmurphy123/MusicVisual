package ie.tudublin;

import example.CubeVisual;
import example.CubeVisual1;
import example.RotatingAudioBands;
//import example.AudioBandsVisual;
import c19342421.MyVisual;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}

	public void rotatingaudiobands()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new RotatingAudioBands());		
	}

	/*public void audiobandsvisual()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AudioBandsVisual());		
	}
	*/
	public void cubevisual1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual1());		
	}

	public void cubevisual()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());		
	}
	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}