package model;

import java.util.List;

public class Trainer {
	private double x;
	private double y;
	private MapSquare currSquare;
	private int numSteps;
	private int pokeballs;
	private List<Item> inventory;
	private List<Pokemon> pokemon;
	
	public Trainer(double x, double y) {
		this.x = x;
		this.y = y; 
	}
	
	// getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	// setters
	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y; 
	}
	
	public void enterSafariZone() {
		// adjust num of steps and pokeballs
	}
	
	public boolean makeMove(String dir) {
		return true;
	}
	
	public void checkInventory() {
		
	}
	
	public boolean hasItem(Item item) {
		return true;
	}
	
	public void useItemOn(Item item, Pokemon poke) {
		
	}
	
	
	public void battle(Pokemon opponent) {
		Battle battle = new Battle(pokemon.get(0), opponent);
	}
}
