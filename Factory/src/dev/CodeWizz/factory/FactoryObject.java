package dev.CodeWizz.factory;

import dev.CodeWizz.engine.GameContainer;
import dev.CodeWizz.engine.Renderer;
import dev.CodeWizz.engine.object.GameObject;

public abstract class FactoryObject extends GameObject {

	public FactoryObject(float x, float y) {
		super(x, y);

	}
	
	public void render(GameContainer gc, Renderer r, FactoryObject[][] grid) {
		
	}
	
	public void update(GameContainer gc, FactoryObject[][] grid) {
		
	}
	
	public void trigger(GameContainer gc, FactoryObject[][] grid) {
		
	}
	
	public void positionUpdate(GameContainer gc, FactoryObject[][] grid) {
		
	}
	
	@Override
	public void render(GameContainer gc, Renderer r) {
		return;
	}
	
}
