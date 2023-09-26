package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class TimberCamp extends BuildingImpl{
    
    public TimberCamp() {
        super(EBuilding.TIMBER_CAMP);
    }
    
    @Override
    public Building clone(){
        return new TimberCamp();
    }
}
