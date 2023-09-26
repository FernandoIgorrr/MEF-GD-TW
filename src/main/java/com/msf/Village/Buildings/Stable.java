package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BelicBuidingImpl;
import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class Stable extends BelicBuidingImpl{
    
    public Stable() {
        super(EBuilding.STABLE);
    }
    
    @Override
    public Building clone(){
        return new Stable();
    }
}
