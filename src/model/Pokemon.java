package model;

public abstract class Pokemon {
	
	private String name;
	private Type type;
	private int baseHP;
	private int baseAttack;
	private int baseDefense;
	private int curHP;
	private int curAttack;
	private int curDefense;
	private Attack[] attacks;
	private int baseCatchRate;
	private int curCatchRate;
	private int baseWillRun;
	private int curWillRun;
	private int secondsTilRun;
	private Status status;
	
	public Pokemon() {
		
	}
	
	//getters
	public String getName() {
		return name;
	}
	public Type getType() {
		return type;
	}
	public int getBaseHP() {
		return baseHP;
	}
	public int getBaseAttack() {
		return baseAttack;
	}
	public int getBaseDefense() {
		return baseDefense;
	}
	public int getCurHP() {
		return curHP;
	}
	public int getCurAttack() {
		return curAttack;
	}
	public int getCurDefense() {
		return curDefense;
	}
	public Attack[] getAttacks() {
		return attacks;
	}
	public int getBaseCatchRate() {
		return baseCatchRate;
	}
	public int getCurCatchRate() {
		return curCatchRate;
	}
	public int getBaseWillRun() {
		return baseWillRun;
	}
	public int getCurWillRun() {
		return curWillRun;
	}
	public int getSecondsTilRun() {
		return secondsTilRun;
	}
	public Status getStatus() {
		return status;
	}

	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public void setBaseHP(int hp) {
		this.baseHP = hp;
	}
	public void setBaseAttack(int attack) {
		this.baseAttack = attack;
	}
	public void setBaseDefense(int defense) {
		this.baseDefense = defense;
	}
	public void setCurHP(int curHP) {
		this.curHP = curHP;
	}
	public void setCurAttack(int curAttack) {
		this.curAttack = curAttack;
	}
	public void setCurDefense(int curDefense) {
		this.curDefense = curDefense;
	}
	public void setAttacks(Attack[] attacks) {
		this.attacks = attacks;
	}
	public void setBaseCatchRate(int catchRate) {
		this.baseCatchRate = catchRate;
	}
	public void setCurCatchRate(int curCatchRate) {
		this.curCatchRate = curCatchRate;
	}
	public void setBaseWillRun(int willRun) {
		this.baseWillRun = willRun;
	}
	public void setCurWillRun(int curWillRun) {
		this.curWillRun = curWillRun;
	}
	public void setSecondsTilRun(int secondsTilRun) {
		this.secondsTilRun = secondsTilRun;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void improveHP(int amount) {
		this.curHP += amount;
	}
	
	public void lowerHP(int amount) {
		this.curHP -= amount;
	}
	
	public void useItem(Item item) {
		
	}
	
}
