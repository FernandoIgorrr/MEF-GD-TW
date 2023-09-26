package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class Farm extends BuildingImpl{

    public Farm() {
        super(EBuilding.FARM);
    }
    
    @Override
    public Building clone(){
        return new Farm();
    }
}
