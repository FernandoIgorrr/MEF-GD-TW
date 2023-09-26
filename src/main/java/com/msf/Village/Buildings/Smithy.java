package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class Smithy extends BuildingImpl{
    
     public Smithy() {
        super(EBuilding.SMITHY);
    }
    
    @Override
    public Building clone(){
        return new Smithy();
    }
}
