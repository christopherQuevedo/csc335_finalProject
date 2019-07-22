package model;

/**
 * This is the Item class. This will hold a graphic of the item along with the name and a description of it.
 * Whenever an item is picked up, there will be a short message describing it's use printed to the user.
 * Every subclass of Item will implement a useItem() method that will define what type of item it is.
 * 
 * @author hanna.veldhuizen
 *
 */
public abstract class Item {
	
	private String name;
	private String description;
	private String type;
	private int maxUses;
	private int uses = 0;
	
	// status item
	// key item: bicycle
	// attack item
	// health item
	
	// will hold the graphic for the item
	// private Image graphic;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaxUses(int max) {
		this.maxUses = max;
	}
	
	public int getMaxUses() {
		return this.maxUses;
	}
	
	public void setType(String newType) {
		this.type = newType;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void incrementUses() {
		this.uses++;
	}
	
	public boolean canUse() {
		if (uses < maxUses) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		return this.getName().toUpperCase() + ": " + this.getDescription() + "\nTYPE: " + this.type;
	}	
}
