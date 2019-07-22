package model.Items;

import model.Item;
import model.Pokemon;
import model.Status;

public class StatusItem extends Item {
	private Status status;
	
	public StatusItem(String n, String desc, int numUses, Status newStatus) {
		this.setName(n);
		this.setDescription(desc);
		this.setMaxUses(numUses);
		this.status = newStatus;
	}
	
	public void useItem(Pokemon pokemon) {
		pokemon.setStatus(status);
		this.incrementUses();
	}
}
