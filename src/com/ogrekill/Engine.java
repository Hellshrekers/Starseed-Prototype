/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ogrekill;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
/**
 *
 * @author ahlquisthunter
 */

public class Engine {
  
    public static void main(String[] args) {
        initDisplay();
        textMessage();
    }
    
    public static void initDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(800,600));
            Display.create();
		} 
        catch (LWJGLException e) {
			System.exit(0);
		}
        //init OpenGL
        GL11.glMatrixMode(GL11.GL_PROJECTION);
	GL11.glLoadIdentity();
	GL11.glOrtho(0, 800, 0, 600, 1, -1);
	GL11.glMatrixMode(GL11.GL_MODELVIEW);
        
        while (!Display.isCloseRequested()) {
            
            Display.update();
                }
        
        Display.destroy();
        }
   }
