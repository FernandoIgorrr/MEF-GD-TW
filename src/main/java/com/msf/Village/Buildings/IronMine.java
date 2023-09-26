package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class IronMine extends BuildingImpl{
    
    public IronMine() {
        super(EBuilding.IRON_MINE);
    }
    
    @Override
    public Building clone(){
        return new IronMine();
    }
}
