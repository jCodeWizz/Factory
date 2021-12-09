package dev.CodeWizz.factory;

import java.awt.Rectangle;

import dev.CodeWizz.engine.GameContainer;
import dev.CodeWizz.engine.Renderer;
import dev.CodeWizz.engine.gfx.light.Light;
import dev.CodeWizz.engine.object.ID;

public class Empty extends FactoryObject {

	public Empty(float x, float y) {
		super(x, y);
		
		this.id = ID.Empty;
		
	}

	@Override
	public void render(GameContainer gc, Renderer r, FactoryObject[][] grid) {
		r.fillRect((int)position.x, (int)position.y, 16, 16, 0xff00ff00, Light.NONE);
	}
	
	@Override
	public Rectangle getBounds() {
		return new Rectangle((int)position.x, (int)position.y, 16, 16);
	}
}
