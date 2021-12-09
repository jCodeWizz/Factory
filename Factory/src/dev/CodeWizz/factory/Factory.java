package dev.CodeWizz.factory;

import java.awt.Rectangle;

import dev.CodeWizz.engine.AbstractGame;
import dev.CodeWizz.engine.GameContainer;
import dev.CodeWizz.engine.Renderer;

public class Factory extends AbstractGame {

	public static Factory inst;
	public Camera cam;
	
	public FactoryObject[][] grid;
	
	public Factory() {
		inst = this;
		grid = new FactoryObject[16][16];
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				grid[i][j] = new Empty(i*16, j*16);
			}
		}
	}

	@Override
	public void update(GameContainer gc, float dt) {
		cam.update(gc);
		
		if(gc.getInput().isButtonDown(1)) {
			for(int i = 0; i < grid.length; i++) {
				for(int j = 0; j < grid[i].length; j++) {
					if(grid[i][j].getBounds().intersects(new Rectangle(gc.getInput().getMouseX(), gc.getInput().getMouseY(), 1, 1))) {
						int x = (int) grid[i][j].getPosition().x;
						int y = (int) grid[i][j].getPosition().y;
						grid[i][j] = new ConveyorBelt(x, y);
					}
				}
			}
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				grid[i][j].render(gc, r, grid);
			}
		}
	}

	@Override
	public void renderBackground(GameContainer gc, Renderer r) {
		
	}

	@Override
	public void renderUI(GameContainer gc, Renderer r) {
		
	}

	@Override
	public void init(GameContainer gc) {
		cam = new Camera();
	}
	
	public static void main(String[] args) {
		GameContainer gc = new GameContainer(new Factory());
		GameContainer.showInfo();
		gc.start();
	}
}
