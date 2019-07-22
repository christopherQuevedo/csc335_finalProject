package model.Items;

import model.Item;
import model.Pokemon;

public class DefenseItem extends Item {
	// strength of attack item
	private double strength;
	
	public DefenseItem(String n, String desc, int numUses, double value) {
		this.setName(n);
		this.setDescription(desc);
		this.setMaxUses(numUses);
		this.strength = value;
		this.setType("Defense");
		
	}
	
	public void useItem(Pokemon pokemon) {
		if (this.strength < 1)
			pokemon.setCurDefense((int) (pokemon.getCurDefense() + (pokemon.getBaseDefense() * this.strength)));
		else
			pokemon.setCurDefense((int) (pokemon.getCurDefense() + this.strength));
	}
}
