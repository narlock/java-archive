package dev.antho.tilegame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import dev.antho.tilegame.display.Display;
import dev.antho.tilegame.gfx.ImageLoader;

public class Game implements Runnable {

	private Display display;
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	//A 'hidden' computer screen that you can't see. Essentially a set of things that are drawn
	//Multiple canvas's that are hidden underneath each other so frames can change smoothly. 
	private BufferStrategy bs;
	private Graphics g;
	
	private BufferedImage testImage;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
	}

	//initializes things for the game to become ready
	private void init() {
		display = new Display(title, width, height);
		testImage = ImageLoader.loadImage("/textures/menuStateBg.png");
	}
	
	private void tick() {
		//tick is like another word for update
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Draw here
		
		g.drawImage(testImage, 0, 0, null);
		
		//end draw
		bs.show();
		g.dispose();
	}

	@Override
	public void run() {
		init();
		
		//Game Loop: update all variables, repaint everything, continuously does this
		while(running) {
			tick();
			render();
		}
		
		//in case it has not been stopped
		stop();
	}
	
	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start(); //calls run method
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
