package com.msf.Village.Army;

import java.util.Set;

import com.msf.Village.Units.Abstracts.UnitImpl;

public abstract class ArmyImpl implements Army{
    
    private int number_of_units_in_population;
    private Set<UnitImpl> Units;

    public ArmyImpl(){

    }

    private void setUnits(){

        this.Units.add(null);
    }
}
