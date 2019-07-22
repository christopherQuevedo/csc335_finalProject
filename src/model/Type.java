package model;

public enum Type {
	FIRE, WATER, GRASS, NORMAL;
	
	public enum Effectiveness{
		SUPER, NORMAL, NOT_VERY;
	}
	
	public Effectiveness getEffectiveness(Type opp) {
		if(this.equals(FIRE)) {
			if(opp.equals(FIRE)) {
				return Effectiveness.NOT_VERY;
			}
			if(opp.equals(WATER)) {
				return Effectiveness.NOT_VERY;
			}
			if(opp.equals(GRASS)) {
				return Effectiveness.SUPER;
			}
		}
		if(this.equals(WATER)) {
			if(opp.equals(FIRE)) {
				return Effectiveness.SUPER;
			}
			if(opp.equals(WATER)) {
				return Effectiveness.NOT_VERY;
			}
			if(opp.equals(GRASS)) {
				return Effectiveness.NOT_VERY;
			}
		}
		if(this.equals(GRASS)) {
			if(opp.equals(FIRE)) {
				return Effectiveness.NOT_VERY;
			}
			if(opp.equals(WATER)) {
				return Effectiveness.SUPER;
			}
			if(opp.equals(GRASS)) {
				return Effectiveness.NOT_VERY;
			}
		}
		return Effectiveness.NORMAL;
	}

}
