package dev.CodeWizz.factory;

import java.awt.event.KeyEvent;

import dev.CodeWizz.engine.GameContainer;
import dev.CodeWizz.engine.util.Vector;

public class Camera {

	public Vector position;
	public final float speed = 5f;

	public float dragSpeed = 0.1f;
	private Vector dragOrigin;

	public Camera() {
		position = new Vector();
		dragOrigin = new Vector();
	}

	public void update(GameContainer gc) {
		
		if (gc.getInput().isKey(KeyEvent.VK_W)) {
			position.y -= speed;
		}

		if (gc.getInput().isKey(KeyEvent.VK_S)) {
			position.y += speed;
		}

		if (gc.getInput().isKey(KeyEvent.VK_A)) {
			position.x -= speed;
		}

		if (gc.getInput().isKey(KeyEvent.VK_D)) {
			position.x += speed;
		}

		if (gc.getInput().isButtonDown(1)) {
			dragOrigin.x = gc.getInput().getMouseX();
			dragOrigin.y = gc.getInput().getMouseY();
			return;
		}

		if (!gc.getInput().isButton(1))
			return;

		Vector pos = new Vector(gc.getInput().getMouseX() - dragOrigin.x, gc.getInput().getMouseY() - dragOrigin.y);
		Vector move = new Vector(pos.x * dragSpeed, pos.y * dragSpeed);

		position.remove(move);

		
	}

	public Vector getPosition() {
		return position;
	}

	public void setPosition(Vector position) {
		this.position = position;
	}
}
