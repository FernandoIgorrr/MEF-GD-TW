package com.msf.Village.Units.Abstracts;

import com.msf.Village.Units.Constantes.EUnit;
import com.msf.Village.Units.Interfaces.Unit;

public abstract class UnitImpl implements Unit{
    private final String name;
    private int level;
    private final int MAX_LEVEL;

    private int offensive_strength;
    private int general_defense;
    private int cavalry_defense;
    private int speed;
    private int haul;

    public UnitImpl(EUnit unit){
        this.name   = unit.getName();
        MAX_LEVEL   = unit.getMaxLevel();
    }

    public String getName(){
        return this.name;
    }
}
