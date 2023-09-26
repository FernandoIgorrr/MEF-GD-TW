package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class ClayPit extends BuildingImpl{
    
     public ClayPit() {
        super(EBuilding.CLAY_PIT);
    }
    
    @Override
    public Building clone(){
        return new ClayPit();
    }
}