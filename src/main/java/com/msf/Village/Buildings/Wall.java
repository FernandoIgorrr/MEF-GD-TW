package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class Wall extends BuildingImpl{
    
    public Wall() {
        super(EBuilding.WALL);
    }
    
    @Override
    public Building clone(){
        return new Wall();
    }
}
