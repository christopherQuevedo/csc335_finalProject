package model.ThePokemon;

import model.Pokemon;
import model.Status;
import model.Type;

public class Kangaskhan extends Pokemon {

	public Kangaskhan() {
		setName("Kangaskhan");
		setType(Type.NORMAL);
		setBaseHP(300);
		setBaseAttack(300);
		setBaseDefense(300);
		setCurHP(300);
		setCurAttack(300);
		setCurDefense(300);
		Attack[] attacks = new Attack[4];
		setAttacks(attacks);
		setBaseCatchRate(.3);
		setCurCatchRate(.3);
		setBaseWillRun(9);
		setCurWillRun(9);
		setSecondsTilRun(1000);
		setStatus(Status.HEALTHY);
	}

}
