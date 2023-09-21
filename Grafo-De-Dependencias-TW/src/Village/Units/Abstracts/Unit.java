package Village.Units.Abstracts;

import Village.Units.Constantes.EUnit;
import Village.Units.Interfaces.IUnit;

public abstract class Unit implements IUnit{
    private final String name;
    private int level;
    private final int MAX_LEVEL;

    private int offensive_strength;
    private int general_defense;
    private int cavalry_defense;
    private int speed;
    private int haul;

    public Unit(EUnit unit){
        this.name   = unit.getName();
        MAX_LEVEL   = unit.getMaxLevel();
    }

    public String getName(){
        return this.name;
    }
}
