package model;

import java.util.Random;

public class SafariBattle {
	private Pokemon opponent;
	private Random rand;
	private int catchRate;
	private int turnsLeft;
	private String status;
	
	public SafariBattle(Pokemon opp) {
		rand = new Random();
		opponent = opp;
		catchRate = opp.getBaseCatchRate() * 100 / 1275;
		System.out.println("Wild " + opp.getName() + " appeared!");
	}
	
	public void ball() {
		System.out.println("I used SAFARI BALL!");
		int modRate = (3 * opponent.getBaseHP() - 2 * opponent.getCurHP()) * (catchRate * 1275/100) / (3 * opponent.getBaseHP());
		int shakeRate = (int) (1048560 / Math.sqrt(Math.sqrt(16711680/modRate)));
		int shakeCheck, shakeCount = 0;
		do {
			shakeCheck = rand.nextInt(65536);
			if(shakeCheck >= shakeRate) {
				shakeCount++;
			}
			else {
				break;
			}
		} while(shakeCount < 4);
		if(shakeCount == 0) {
			System.out.println("Oh, no!\nThe POK" + '\u00E9' + "MON broke free!");
		}
		else if(shakeCount == 1) {
			System.out.println("Aww!\nIt appeared to be caught!");
		}
		else if(shakeCount == 2) {
			System.out.println("Aargh!\nAlmost had it!");
		}
		else if(shakeCount == 3) {
			System.out.println("Shoot!\nIt was so close, too!");
		}
		else if(shakeCount == 4) {
			System.out.println("Gotcha!\n" + opponent.getName() + " was caught!");
			System.out.println(opponent.getName() + "'s data was\nadded to the POK" + '\u00E9' + "DEX.");
		}
		endOfTurn();
	}
	
	public void bait() {
		status = "eating";
		turnsLeft = rand.nextInt(5) + 2; 
		if(catchRate > opponent.getBaseCatchRate()) {
			catchRate = opponent.getBaseCatchRate();
		}
		catchRate /= 2;
		endOfTurn();
	}
	
	public void rock() {
		status = "angry";
		turnsLeft = rand.nextInt(5) + 2; 
		if(catchRate < opponent.getBaseCatchRate()) {
			catchRate = opponent.getBaseCatchRate();
		}
		catchRate *= 2;
		if(catchRate > 255) {
			catchRate = 255;
		}
		endOfTurn();
	}
	
	public void endOfTurn() {
		if(turnsLeft > 0) {
			turnsLeft--;
			if(turnsLeft == 0) {
				status = "";
				catchRate = opponent.getBaseCatchRate();
			}
		}
		if(rand.nextInt(100) < opponent.getBaseWillRun()*2) {
			
		}
	}
}
