package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class VillageHeadQuarters extends BuildingImpl{

    public VillageHeadQuarters() {
        super(EBuilding.VILLAGE_HEADQUARTERS);
    }

    @Override
    public Building clone(){
        return new VillageHeadQuarters();
    }
}
