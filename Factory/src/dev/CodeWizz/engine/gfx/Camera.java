package dev.CodeWizz.engine.gfx;

import dev.CodeWizz.engine.GameContainer;
import dev.CodeWizz.factory.Factory;

public class Camera {

	private int x, y;
	
	public void update(GameContainer gc) {
		
		x = (int) Factory.inst.cam.getPosition().x - 8 - gc.getWidth() / 2;
		y = (int) Factory.inst.cam.getPosition().y - 8 - gc.getHeight() / 2;
		gc.getRenderer().setCamX(x);
		gc.getRenderer().setCamY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
