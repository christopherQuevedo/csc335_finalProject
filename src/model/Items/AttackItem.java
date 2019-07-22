package model.Items;

import model.Item;
import model.Pokemon;

public class AttackItem extends Item {
	// strength of attack item
	private double strength;
	
	public AttackItem(String n, String desc, int numUses, double value) {
		this.setName(n);
		this.setDescription(desc);
		this.setMaxUses(numUses);
		this.strength = value;
		this.setType("Attack");
	}
	
	public void useItem(Pokemon opponent) {
		if (this.strength < 1)
			opponent.setCurHP((int) (opponent.getCurHP() - (opponent.getCurHP() * strength)));
		else
			opponent.lowerHP((int) this.strength);
		
		this.incrementUses();
		// attack opponent
	}
}
