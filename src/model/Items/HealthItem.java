package model.Items;

import model.Item;
import model.Pokemon;

/**
 * Health items improve the hp of a Pokemon during battle.
 * 
 * @author hanna.veldhuizen
 *
 */
public class HealthItem extends Item {
	// value by which item improves hp upon use
	private double strength;
	
	public HealthItem(String n, String desc, int numUses, double value) {
		this.setName(n);
		this.setDescription(desc);
		this.setMaxUses(3);
		this.strength = value;
		this.setType("Trainer");
	}
	
	public void useItem(Pokemon pokemon) {
		if (strength < 1)
			pokemon.setCurHP((int) (pokemon.getCurHP() + (pokemon.getBaseHP() * strength)));
		else if (strength == 1)
			pokemon.setCurHP(pokemon.getBaseHP());
		else
			pokemon.improveHP((int) this.strength);
		this.incrementUses();
	}
}
