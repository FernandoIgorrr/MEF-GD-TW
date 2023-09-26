package com.msf.Factory;

import java.util.HashMap;
import java.util.Map;

import com.msf.Village.Buildings.Farm;
import com.msf.Village.Buildings.VillageHeadQuarters;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class BuildingFactory implements AbstractFactory<Building>{

    private Map<EBuilding,Building> buildingPrototype = new HashMap<>();

    public BuildingFactory(){
        this.createPrototypeMap();
    }

    @Override
    public Building build(EBuilding eBuilding) {
        return this.buildingPrototype.get(eBuilding).clone();
    }

    private void createPrototypeMap(){
        this.buildingPrototype.put(EBuilding.FARM,new Farm());
        this.buildingPrototype.put(EBuilding.VILLAGE_HEADQUARTERS,new VillageHeadQuarters());
    }

    @Override
    public Building build() {
        // TODO Auto-generated method stub
        return null;
    }

}
