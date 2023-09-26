package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class WareHouse extends BuildingImpl{
    
    public WareHouse() {
        super(EBuilding.WARE_HOUSE);
    }
    
    @Override
    public Building clone(){
        return new WareHouse();
    }
}
