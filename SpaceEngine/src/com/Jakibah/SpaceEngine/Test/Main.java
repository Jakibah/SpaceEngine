package com.Jakibah.SpaceEngine.Test;

import org.lwjgl.opengl.Display;

import com.Jakibah.SpaceEngine.Render.DisplayManager;
import com.Jakibah.SpaceEngine.Render.Loader;
import com.Jakibah.SpaceEngine.Render.RawModel;
import com.Jakibah.SpaceEngine.Render.Render;

public class Main {

	public static void main(String[] args) {
		
		DisplayManager.createDisplay(1280, 720, 120, "SpaceEngine by Jakibah");
		
		Loader loader = new Loader();
		Render renderer = new Render();
		
		float[] vertices = {
				-0.5f, 0.5f, 0f,
				-0.5f,-0.5f, 0f,
				0.5f, -0.5f, 0f,
				
				0.5f, -0.5f, 0f,
				0.5f, 0.5f, 0f,
				-0.5f, 0.5f, 0f
		};
		
		RawModel model = loader.loadToVAO(vertices);
		
		while(!Display.isCloseRequested()){
		    renderer.prepare();
			//ups
			
			
			//fps
			renderer.render(model);
			DisplayManager.updateDisplay();
		}
		Loader.cleanUp();
		DisplayManager.closeDisplay();
		

	}

}
