package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import model.Items.AttackItem;
import model.Items.Bicycle;
import model.Items.DefenseItem;
import model.Items.HealthItem;
import model.Items.StatusItem;

public class ItemDictionary {
	private HashMap<String, Item> itemDictionary = new HashMap<>();
	
	public ItemDictionary() {
		itemDictionary.put("Bicycle", new Bicycle());
		itemDictionary.put("Fire Ball", new AttackItem(
				"Fire Ball", "A fire ball can be used during battle to attack an opponent. Lowers the opponents HP by 20%. Can be used once.", 1, 0.20));
		itemDictionary.put("Freeze Stone", new AttackItem("Freeze Stone", "Freezes opponent during battle. Can be used twice. Reduces opponent's HP by 50.", 2, 50));
		itemDictionary.put("First Aid Kit", new HealthItem("First Aid Kit", "Fully restores HP during battle. Can be used once.", 1, 1));
		itemDictionary.put("Expresso Shot", new HealthItem("Expresso Shot", "Restores 20% of HP during battle. Can be used three times.", 3, 0.20));
		itemDictionary.put("Liquid Strength", new DefenseItem("Liquid Strength", "Elixir that improves attack effectiveness of the next move by 30% in battle. Can be used 3 times.", 3, 0.30));
		itemDictionary.put("Full Heal", new StatusItem("Full Heal", "It heals all the status problems of a single Pokémon. Can be used 3 times.", 3, Status.HEALTHY));
	}
	
	public void printDictionary() {
		ArrayList<String> sortedKeys = new ArrayList<>(itemDictionary.keySet());
		Collections.sort(sortedKeys);
		
		System.out.println("All Available Items:\n\n");
		for (String itemName : sortedKeys) {
			System.out.print(itemDictionary.get(itemName));
			System.out.println();
		}
	}
}
