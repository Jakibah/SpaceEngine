package com.Jakibah.SpaceEngine.Render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

import com.Jakibah.SpaceEngine.Models.RawModel;
import com.Jakibah.SpaceEngine.Models.TexturedModel;
import com.Jakibah.SpaceEngine.Textures.ModelTexture;

public class Render {
	
	public void prepare(){
		GL11.glClearColor(1,0,0,1);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
	}
	
	public void render(TexturedModel texturedModel){
		RawModel model = texturedModel.getRawModel();
		ModelTexture texture = texturedModel.getTexture();
		GL30.glBindVertexArray(model.getVaoID());
		GL20.glEnableVertexAttribArray(0);
		GL20.glEnableVertexAttribArray(1);
		GL13.glActiveTexture(GL13.GL_TEXTURE0);
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture.getTextureID());
		GL11.glDrawElements(GL11.GL_TRIANGLES, model.getVertexCount(), GL11.GL_UNSIGNED_INT, 0);
		GL20.glDisableVertexAttribArray(0);
		GL20.glDisableVertexAttribArray(1);
		GL30.glBindVertexArray(0);
	}

}
