package com.Jakibah.SpaceEngine.Test;

import org.lwjgl.opengl.Display;

import com.Jakibah.SpaceEngine.Render.DisplayManager;
import com.Jakibah.SpaceEngine.Render.Loader;
import com.Jakibah.SpaceEngine.Render.RawModel;
import com.Jakibah.SpaceEngine.Render.Render;
import com.Jakibah.SpaceEngine.Shaders.StaticShader;

public class Main {

	public static void main(String[] args) {
		
		DisplayManager.createDisplay(1280, 720, 120, "SpaceEngine by Jakibah");
		
		Loader loader = new Loader();
		Render renderer = new Render();
		
		StaticShader shader = new StaticShader();
		
		float[] vertices = {
				-0.5f, 0.5f, 0f,
				-0.5f,-0.5f, 0f,
				0.5f, -0.5f, 0f,
				0.5f, 0.5f,  0f,
				
		};
		
		int[] indices = {
				0,1,3,
				3,1,2
		};
		
		RawModel model = loader.loadToVAO(vertices, indices);
		
		while(!Display.isCloseRequested()){
		    renderer.prepare();
		    shader.start();
			//ups
			
			
			//fps
			renderer.render(model);
			
			shader.stop();
			DisplayManager.updateDisplay();
		}
		shader.cleanUp();
		Loader.cleanUp();
		DisplayManager.closeDisplay();
		

	}

}
