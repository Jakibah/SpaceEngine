package com.Jakibah.SpaceEngine.Test;

import org.lwjgl.opengl.Display;

import com.Jakibah.SpaceEngine.Render.DisplayManager;

public class Main {

	public static void main(String[] args) {
		
		DisplayManager.createDisplay();
		
		while(!Display.isCloseRequested()){
			//ups
			
			//fps
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.closeDisplay();

	}

}
