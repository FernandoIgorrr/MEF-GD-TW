package com.msf.Village;

import java.util.HashSet;
import java.util.Set;

import com.msf.Entity.Player;
import com.msf.Factory.AbstractFactory;
import com.msf.Factory.FactoryProvider;
import com.msf.Graph.BuildingGraph;
import com.msf.Map.Coordinates;
import com.msf.Map.Interfaces.MapObject;
import com.msf.Village.Army.Army;
import com.msf.Village.Army.ArmyImpl;
import com.msf.Village.Buildings.Farm;
import com.msf.Village.Buildings.VillageHeadQuarters;
import com.msf.Village.Buildings.Abstract.BuildingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;


public class Village implements MapObject{


    private Coordinates         coordinates;
    private Player              owner;
    private BuildingGraph       BuildingGraph; 
    private Integer             population;
    private Integer             loyalty;
    private Set<BuildingImpl>   buildings;
    private ArmyImpl            army;

    private AbstractFactory abstractFactory;

    public Village(){
        abstractFactory = FactoryProvider.getFactory("building");
    }

    private int calcPopulation(){{
        return 1;
    }}

    private void buildVillage(){
        Building VILLAGE_HEADQUARTERS = (VillageHeadQuarters)abstractFactory.build(EBuilding.VILLAGE_HEADQUARTERS);

    }
}
