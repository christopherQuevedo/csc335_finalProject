package model.ThePokemon;

import model.Attack;
import model.Pokemon;
import model.Status;
import model.Type;

public class Blastoise extends Pokemon {

	public Blastoise() {
		
		setName("Blastoise");
		setType(Type.WATER);
		setBaseHP(300);
		setBaseAttack(300);
		setBaseDefense(300);
		setCurHP(300);
		setCurAttack(300);
		setCurDefense(300);
		Attack[] attacks = new Attack[4];
		setAttacks(attacks);
		setBaseCatchRate(45);
		setCurCatchRate(45);
		setBaseWillRun(5);
		setCurWillRun(5);
		setSecondsTilRun(1000);
		setStatus(Status.HEALTHY);
	}

}
