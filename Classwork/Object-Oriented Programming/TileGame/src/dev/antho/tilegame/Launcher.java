package dev.antho.tilegame;

import dev.antho.tilegame.display.Display;

public class Launcher {
	public static void main(String[] args) {
		Game game = new Game("TileGameTest", 1280, 720);
		game.start();
	}
}
