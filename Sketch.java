import processing.core.PApplet;

/**
* This program Sketch.Java calls functions to draw a scene with houses, birds and a sun
* @author: Garv Choudhry
*
 */
public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// Calling size function
    size(720, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 200, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  //ENVIRONMENT DESIGNS 
    // Draw a yellow circle to be the sun
    stroke(255, 167, 0);
    fill(255, 255, 0);
    ellipse(width/4, height/8, width/8, height/6);

    // Draw base grass
    stroke(0, 120, 0);
    fill(0, 120, 0);
    rect(0, height/2, width, height/2);
    
    // RED HOUSE DESIGNS
    // Draw the body 
    stroke(0);
    fill(160, 55, 63);
    rect((float)(width/1.455), (float)(height/2.174), (float)(width/3.6), (float)(height/2.5));

    // Draw the roof
    fill(0);
    triangle((float)(width/1.4845), (float)(height/2.174), (float)(width/1.22034), (float)(height/4.545), (float)(width/1.0212766), (float)(height/2.1739)); 

    // Draw the door 
    fill(0);
    rect((float)(width/1.38462), (float)(height/1.42857), (float)(width/14.4), (float)(height/6.25)); 

    // Draw the doorknob 
    fill(200, 60, 65);
    ellipse((float)(width/1.2857), (float)(height/1.25), width/48, (float)(height/33.333)); 

    // Draw windows
    fill(0);
    rect((float)(width/1.384615), (float)(height/1.923077), width/18, (float)(height/12.5));
    rect((float)(width/1.17073), (float)(height/1.923077), width/18, (float)(height/12.5));
    rect((float)(width/1.22033), (float)(height/1.42857), width/8, (float)(height/12.5));
  }
  
}