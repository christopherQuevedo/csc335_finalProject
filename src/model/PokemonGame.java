package model;

import java.util.Observable;
import java.util.Random;

public class PokemonGame extends Observable {
	public Map map;
	public Trainer player;
	public PokemonGame(Map map, Trainer player) {
		this.map = map;
		this.player = player;
		setChanged();
		notifyObservers();
	}
	
	// returns void, given a char - n, e, s, w - move in that direction if possible
	public void moveTrainer(char direction) {
		// check for direction, in bounds, and obstacle
		if(direction == 'n' && player.getX() - 1 != -1 && !map.getMap()[(int) player.getX() - 1][(int) player.getY()].getObstacle())
			player.setLocation(player.getX() - 1, player.getY());
		if(direction == 'e' && player.getY() + 1 < map.getHEIGHT() && !map.getMap()[(int) player.getX()][(int) player.getY() + 1].getObstacle())
			player.setLocation(player.getX(), player.getY() + 1);
		if(direction == 's' && player.getX() + 1 < map.getWIDTH() && !map.getMap()[(int) player.getX() + 1][(int) player.getY()].getObstacle())
			player.setLocation(player.getX() + 1, player.getY());
		if(direction == 'w' && player.getY() - 1 != -1 && !map.getMap()[(int) player.getX()][(int) player.getY() - 1].getObstacle())
			player.setLocation(player.getX(), player.getY() - 1);
		if(map.getMap()[(int) player.getX()][(int) player.getY()].getTile() == "G") {
			Random rng = new Random();
			int encounter = rng.nextInt(100);
			if(encounter < 10) {
				System.out.println("POKEMON ENCOUNTERED");
			}
		}
		setChanged();
		notifyObservers();
	}
	/*
	public String printMap() {
		String mapString = "";
		for(int i = 0; i < map.getWIDTH(); i++) {
			for(int j = 0; j < map.getHEIGHT(); j++) {
				if(player.getX() == i && player.getY() == j) {
					mapString += "P ";
				}
				else
					mapString += map.getMap()[i][j].getTile() + " ";
			}
			mapString += "\n";
		}
		return mapString;
	}
	*/
	public String printMap() {
		String mapString = "";
		int topX = (int) (player.getX() - 5);
		int topY = (int) (player.getY() - 5);
		int botX = topX + 10;
		int botY = topY + 10;
		System.out.println(topX);
		System.out.println(topY);
		System.out.println(botX);
		System.out.println(botY);
		System.out.println(player.getX());
		System.out.println(player.getY());
		for(int i = topX; i < botX; i++) {
			for(int j = topY; j < botY; j++) {
				if(player.getX() == i && player.getY() == j) {
					mapString += "P ";
				}
				else
					mapString += map.getMap()[i][j].getTile() + " ";
			}
			mapString += "\n";
		}
		return mapString;
	}
	
}
