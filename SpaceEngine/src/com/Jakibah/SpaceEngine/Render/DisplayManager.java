package com.Jakibah.SpaceEngine.Render;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
	public static int WIDTH, HEIGHT, FPS_CAP;
	public static String TITLE;
	
	
	public static void createDisplay(int Width, int Height, int Fps_cap, String Title){
		WIDTH = Width;
		HEIGHT = Height;
		FPS_CAP = Fps_cap;
		TITLE = Title;
		ContextAttribs attribs = new ContextAttribs(3, 2).withForwardCompatible(true).withProfileCore(true);
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			//Display.setFullscreen(true);
			Display.create(new PixelFormat(), attribs);
			Display.setTitle(TITLE);
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
		
		
	}
	
	public static void updateDisplay(){
		
		Display.sync(FPS_CAP);
		Display.update();
		
	}
	public static void closeDisplay(){
		Display.destroy();
	}

}
