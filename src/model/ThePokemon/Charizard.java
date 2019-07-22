package model.ThePokemon;

import model.Attack;
import model.Pokemon;
import model.Status;
import model.Type;

public class Charizard extends Pokemon{

	public Charizard() {
		
		setName("Charizard");
		setType(Type.FIRE);
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
		setBaseWillRun(5);
		setCurWillRun(5);
		setSecondsTilRun(1000);
		setStatus(Status.HEALTHY);
	}

}
