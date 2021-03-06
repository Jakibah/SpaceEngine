package com.Jakibah.SpaceEngine.Shaders;

public class StaticShader extends ShaderProgram {
	
	private static final String VERTEX_FILE =  "src/com/Jakibah/SpaceEngine/Shaders/vertexShader.sha";
	private static final String FRAGMENT_FILE =  "src/com/Jakibah/SpaceEngine/Shaders/fragmentShader.sha";


	public StaticShader() {
		super(VERTEX_FILE, FRAGMENT_FILE);
		
	}


	@Override
	protected void bindAttributes() {
		super.bindAttribute(0, "position");
		super.bindAttribute(1, "textureCoords");
		
		
	}
	
	
}
